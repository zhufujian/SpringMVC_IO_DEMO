package com.study.demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPrivate01 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Test01 p = new Test01();
		Class<?> classType = p.getClass();
		Method method = classType.getDeclaredMethod("getName",
				new Class[] { String.class });
		method.setAccessible(true);
		Object object = method.invoke(p, new Object[] { "tom" });
		System.out.println((String)object);
	}
}
 class Test01 {
	@SuppressWarnings("unused")
	private String getName(String name) {
		return "This i:" + name;
	}
}