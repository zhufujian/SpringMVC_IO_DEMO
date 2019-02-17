package com.study.demo.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPrivate02 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Test02 p = new Test02();
		Class<?> classType = p.getClass();
		Field field = classType.getDeclaredField("name");
		//设置true,使用可以绕过Java语言规范的检查
		field.setAccessible(true);
		//对变量进行设置值
		field.set(p, "李四");
		Method method = classType.getDeclaredMethod("getName", new Class[] {});
		method.setAccessible(true);
		Object object = method.invoke(p, new Object[] {});
		System.out.println((String) object);
	}
}
 class Test02 {
	  private String name="张三";
	  private String getName()
	  {
		  return name;
	  }
}