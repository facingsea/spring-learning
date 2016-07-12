package com.facingsea.springexercise.g_aop.ga_proxy.jdk;

public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("hello jdk proxy ... ");
	}

}
