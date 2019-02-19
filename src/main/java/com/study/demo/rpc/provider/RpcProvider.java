package com.study.demo.rpc.provider;

import com.study.demo.rpc.HelloService;
import com.study.demo.rpc.RpcFramework;

public class RpcProvider {

	public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        // RPC框架将服务暴露出来，供客户端消费 
        RpcFramework.export(service, 1234);
    }
}
