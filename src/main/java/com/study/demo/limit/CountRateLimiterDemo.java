package com.study.demo.limit;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CountRateLimiterDemo {

	private static AtomicInteger count = new AtomicInteger(0); 
	public static void exec() {  
        if (count.get() >= 5) {  
            System.out.println(count.get()+"请求用户过多，请稍后在试！"+System.currentTimeMillis()/1000);  
            try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
        } else {  
            count.incrementAndGet();  
            try {  
                //处理核心逻辑  
                TimeUnit.SECONDS.sleep(1);  
                System.out.println(count.get()+"--"+System.currentTimeMillis()/1000);  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            } finally {  
                count.decrementAndGet();  
            }  
        }  
    }  
	public static void main(String[] args) {
		System.out.println();
	}
}
