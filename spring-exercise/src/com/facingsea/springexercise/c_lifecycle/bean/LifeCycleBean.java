package com.facingsea.springexercise.c_lifecycle.bean;

public class LifeCycleBean {
	
	private String name = "lift cycle bean name .";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Invoked when the @LifeCycleBean init.
	 */
	public void init(){
		System.out.println("life cycle bean init ...");
	}
	
	/**
	 * Invoked when the @LifeCycleBean destory.
	 */
	public void destory(){
		System.out.println("life cycle bean destory ...");
	}
}
