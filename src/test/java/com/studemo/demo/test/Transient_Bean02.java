package com.studemo.demo.test;

import java.io.Serializable;

public class Transient_Bean02 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name02;
	
	private transient String transient_name;

	/** 
	* @Title:
	* @Description: 
	* @param name02
	* @param transient_name
	*/
	public Transient_Bean02(String name02, String transient_name) {
		super();
		this.name02 = name02;
		this.transient_name = transient_name;
	}
	  public String toString() {  
	         return "name02=" + name02 + ", transient_name=" + transient_name;  
	     } 
	  
	public String getName02() {
		return name02;
	}

	public void setName02(String name02) {
		this.name02 = name02;
	}

	public String getTransient_name() {
		return transient_name;
	}

	public void setTransient_name(String transient_name) {
		this.transient_name = transient_name;
	}
}
