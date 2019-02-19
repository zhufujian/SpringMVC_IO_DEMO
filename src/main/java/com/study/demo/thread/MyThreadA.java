package com.study.demo.thread;

public class MyThreadA extends Thread{

	@Override
    public void run() {
	     super.run();
			for (int i = 0; i < 50; i++) {
				if (this.interrupted()) {
					System.out.println("已经是停止状态了!我要退出了!");
					//throw new InterruptedException();
					break;
				}
				System.out.println("i=" + (i + 1));
			}
			System.out.println("我在for下面");
		/*	try {
        } catch (InterruptedException e) {
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }*/
    }
}
