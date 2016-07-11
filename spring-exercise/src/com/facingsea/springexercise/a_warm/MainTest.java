package com.facingsea.springexercise.a_warm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facingsea.springexercise.a_warm.service.HelloService;

public class MainTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/facingsea/springexercise/a_warm/res/a_beans.xml");
		HelloService service = (HelloService) context.getBean("helloService");
		service.sayHello();
	}

}
