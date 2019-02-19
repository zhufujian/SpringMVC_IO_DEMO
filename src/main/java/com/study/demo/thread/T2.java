package com.study.demo.thread;

public class T2 {
	public static void main(String[] args) throws InterruptedException {
	    Service2 s=new Service2();
	    MyThread03 t1=new MyThread03(s,'A');
	    MyThread03 t2=new MyThread03(s,'B');
	        t1.start();
	        t2.start();
	        t2.wait();
	        
	    }
	        
	    }
	    class Service2 
	    {
	    	 String s=new String("锁");
	      /*  public  void service(char name)
	        {
	            synchronized(this)
	                {
	                for (int i = 3; i >0; i--) {
	                    System.out.println(name+":"+i);
	                }
	            }
	        }*/
	    	 public  void service(char name)
		        {
	    		
		            synchronized(s)
		                {
		                for (int i = 3; i >0; i--) {
		                    System.out.println(name+":"+i);
		                }
		            }
		        }
	    }
	    class MyThread03 extends Thread
	    {
	        Service2 s=new Service2();
	        char name;
	        public  MyThread03(Service2 s,char name)
	        {
	            this.s=s;
	            this.name=name;
	        }
	        public void run()
	        {
	            s.service(name);
	        }
    }