package com.study.demo.limit;

public class LimitThread extends Thread {

	@Override
	public void run() {
		super.run();
		while(true){
	//		new CountRateLimiterDemo().exec();
			new CountRateLimiterDemo2().exec();
		}
	}

	
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<6;i++){
			new LimitThread().start();
			Thread.sleep(1000);
		}
		
		
	}
}
