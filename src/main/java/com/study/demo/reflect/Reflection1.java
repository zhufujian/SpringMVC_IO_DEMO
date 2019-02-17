package com.study.demo.reflect;

import java.lang.reflect.Method;

public class Reflection1 {

	public static void main(String[] args) throws ClassNotFoundException {
		//使用Class去调用静态方法forName()获得java.lang.Class的Class对象
		Class<?> tclass= Class.forName("java.lang.Class");
		
		Method[] methods=tclass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("========"+method);
		}
	}
}
