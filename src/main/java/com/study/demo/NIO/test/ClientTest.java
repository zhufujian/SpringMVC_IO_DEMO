package com.study.demo.NIO.test;

import java.util.Scanner;

import com.study.demo.NIO.Client;

/**
 * 
*
* @Description: 测试方法
* @ClassName: Test 
* @author zhufj
* @date 2019年2月15日 下午5:43:19 
*
 */
public class ClientTest {  
    //测试主方法  
    @SuppressWarnings("resource")  
    public static void main(String[] args) throws Exception{  
        //运行客户端   
        Client.start();  
        while(Client.sendMsg(new Scanner(System.in).nextLine()));  
    }  
}  