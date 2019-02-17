package com.study.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.study.demo.reflect.bean.Person;

public class Reflection2 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//情况一:如果是无参的构造函数来生成对象:
		//no_args();
		//情况二:现在是有参构造函数，那我们只有一种方法来通过反射生成对象:  
		args();
	}
	
	private static void no_args() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//如果是无参的构造函数来生成对象
				//首先我们去获取Class对象，然后直接通过Class对象去调用newInstance()方法就可以
		        Class<?> classType = Reflection2.class;
		       // Object reflection2 = classType.newInstance();
		        Constructor<?> constructor = classType.getConstructor(new Class[] {});
		        
		     	Object reflection2 = constructor.newInstance(new Object[] {});
		        System.out.println(reflection2.toString());
	}
	
	private static void args() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Class<?> classType = Person.class;  
		Constructor cons = classType.getConstructor(new Class[]{String.class, int.class});   
		Object obj = cons.newInstance(new Object[]{"zhangsan", 19}); 
		System.out.println(obj.toString());
		
	}
}
