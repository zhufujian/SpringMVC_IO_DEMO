package com.study.demo.reflect.bean;

public class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** 
	* @Title:
	* @Description: 
	* @param name
	*/
	public Person(String name) {
		super();
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/** 
	* @Title:
	* @Description: 
	* @param name
	* @param age
	*/
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
