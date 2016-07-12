package com.facingsea.springexercise.g_aop.ga_proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.facingsea.springexercise.g_aop.ga_proxy.cglib.beans.UserServiceImpl;

public class CGlibTest {
	
	public static void main(String[] args) {
		UserServiceImpl service = new UserServiceImpl();
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserServiceImpl.class);
		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				System.out.println("代理前。。。");
				Object ret = method.invoke(service, args);
				System.out.println("代理后。。。");
				return ret;
			}
		});
		UserServiceImpl proxy = (UserServiceImpl) enhancer.create();
		System.out.println("after creating ... get the class name");
		System.out.println(proxy.getClass().getName());
		proxy.saveUser();
	}

}
