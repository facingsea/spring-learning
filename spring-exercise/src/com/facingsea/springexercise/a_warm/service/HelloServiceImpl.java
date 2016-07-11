package com.facingsea.springexercise.a_warm.service;

public class HelloServiceImpl implements HelloService {

	private String info;
	
	@Override
	public void sayHello() {
		System.out.println("hello " + info);
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
