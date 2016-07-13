package com.facingsea.springexercise.g_aop.gc_advisor.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("方法执行前。。。");
		Object obj = invocation.proceed();
		System.out.println("方法执行后。。。");
		return obj;
	}

}
