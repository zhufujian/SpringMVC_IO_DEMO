package com.study.demo.thread;

public class Test {

	public static void main(String[] args) throws InterruptedException {
       /* try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200); 
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");*/
		 MyThread2 thread = new MyThread2();
         thread.start();
         //thread.interrupt();
         thread.interrupt();
         //Thread.sleep(4000);
         //Thread.currentThread().interrupt();
        /* Thread.sleep(4000);
         System.out.println("是否停止1？="+Thread.interrupted());//false
         System.out.println("是否停止2？="+thread.interrupted());//false
*/        
         System.out.println(thread.isInterrupted());//true
         System.out.println(thread.isInterrupted());//true
         System.out.println("是否停止1？="+thread.interrupted());//false
         System.out.println("是否停止2？="+thread.interrupted());//false
       
   }
}
