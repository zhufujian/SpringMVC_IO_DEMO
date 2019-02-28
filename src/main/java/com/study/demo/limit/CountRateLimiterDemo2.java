package com.study.demo.limit;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CountRateLimiterDemo2 {
	private static Semaphore semphore = new Semaphore(5);  
	   
    public static void exec() {  
    	try {  
        if(semphore.getQueueLength()>=5){  
            System.out.println(semphore.getQueueLength()+"当前等待排队的任务数大于100，请稍候再试...");  
            TimeUnit.SECONDS.sleep(1);  
        }  
            semphore.acquire();  
            // 处理核心逻辑  
            TimeUnit.SECONDS.sleep(1);  
            System.out.println(semphore.getQueueLength()+"--" + System.currentTimeMillis() / 1000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        } finally {  
            semphore.release();  
        }  
    }  
}
