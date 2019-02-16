package com.study.demo.BIO.test;

import java.io.IOException;

import com.study.demo.BIO.ServerNormal;
/**
 * 
*
* @Description: 测试方法
* @ClassName: ServerTest 
* @author zhufj
* @date 2019年2月15日 下午5:24:42 
*
 */
public class ServerTest {  
    //测试主方法  
    public static void main(String[] args) throws InterruptedException {  
        //运行服务器  
        new Thread(new Runnable() {  
            @Override  
            public void run() {  
                try {  
                	ServerNormal.start();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }).start();  
    }  
}  