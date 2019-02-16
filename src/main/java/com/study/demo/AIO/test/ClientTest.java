package com.study.demo.AIO.test;

import java.util.Scanner;

import com.study.demo.AIO.Client;

public class ClientTest {

	 //测试主方法  
    @SuppressWarnings("resource")  
    public static void main(String[] args) throws Exception{  
        //运行客户端   
        Client.start();  
        System.out.println("请输入请求消息：");  
        Scanner scanner = new Scanner(System.in);  
        while(Client.sendMsg(scanner.nextLine())); 
    }
}
