package com.study.demo.AIO;


/**
 * 
*
* @Description: AIO服务端
* @ClassName: Server 
* @author zhufj
* @date 2019年2月15日 下午6:11:18 
*
 */
public class Server {  
    private static int DEFAULT_PORT = 12345;  
    private static AsyncServerHandler serverHandle;  
    public volatile static long clientCount = 0;  
    public static void start(){  
        start(DEFAULT_PORT);  
    }  
    public static synchronized void start(int port){  
        if(serverHandle!=null)  
            return;  
        serverHandle = new AsyncServerHandler(port);  
        new Thread(serverHandle,"Server").start();  
    }  
}  