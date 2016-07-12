package com.facingsea.springexercise.g_aop.ga_proxy.jdk;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
	
	public static void main(String[] args) {
		HelloService helloService = new HelloServiceImpl();
		System.out.println(helloService.hashCode());
		System.out.println(helloService.getClass().getName());
		
		HelloService proxy = (HelloService) Proxy.newProxyInstance(helloService.getClass().getClassLoader(), 
				helloService.getClass().getInterfaces(), 
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("invoke method ... ");
						return method.invoke(helloService, args);
					}
				});
		
		System.out.println(proxy.hashCode());
		System.out.println(proxy.getClass().getName());
		proxy.sayHello();
		
		
		// 将代理类proxy输出为文件，之后可以通过jd-gui工具查看代理类的源码
		String path = "D:\\$Proxy0.class";
		byte[] bytes = sun.misc.ProxyGenerator.generateProxyClass("$Proxy0", helloService.getClass().getInterfaces());
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(path);
			out.write(bytes);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(out != null ){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
