package com.study.demo.thread;

public class T1 {
    public static void main(String[] args) {
        PrivateNum p=new PrivateNum();
        MyThread threadA=new MyThread('A',p);
        MyThread threadB=new MyThread('B',p);
        threadA.start();
        threadB.start();
    }}
    class MyThread extends Thread
    {
        char i;
        PrivateNum p;
        public MyThread(char i,PrivateNum p)
        {
            this.i=i;
            this.p=p;
        }
        public void run() 
        {
            //p.test(i);
            p.test2(i); 
            //
        }
    }
    class PrivateNum
    {
        
        public void test( char i) 
        {
            try {
                int num=0;
                if(i=='A')
                {
                    num=100;
                    
                    System.out.println("线程A已经设置完毕");
                    Thread.sleep(1000);
                }
                else
                {
                    num=200;
                    System.out.println("线程B已经设置完毕");
                }
                System.out.println("线程"+i+"的值："+num);
                
            }
         catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }}
        int num=0;
        public synchronized  void test2( char i) 
        {
     
            try {
            
                if(i=='A')
                {
                    num=100;
                    
                    System.out.println("线程A已经设置完毕");
                    Thread.sleep(1000);
                }
                else
                {
                    num=200;
                    System.out.println("线程B已经设置完毕");
                }
                System.out.println("线程"+i+"的值："+num);
                
            }
         catch (InterruptedException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }}
    }