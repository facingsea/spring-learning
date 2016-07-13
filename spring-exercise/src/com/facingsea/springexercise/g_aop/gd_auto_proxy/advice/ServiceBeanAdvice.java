package com.facingsea.springexercise.g_aop.gd_auto_proxy.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class ServiceBeanAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("方法执行前测试。。。");
	}

}
