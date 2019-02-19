package com.study.demo.rpc.provider;

import com.study.demo.rpc.HelloService;

public class HelloServiceImpl implements HelloService{

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public String hi(String msg) {
		return "Hi, " + msg;

	}

}
