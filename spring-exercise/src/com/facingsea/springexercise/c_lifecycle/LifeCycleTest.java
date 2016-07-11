package com.facingsea.springexercise.c_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facingsea.springexercise.c_lifecycle.bean.LifeCycleBean;

public class LifeCycleTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/facingsea/springexercise/c_lifecycle/res/c_beans.xml");
		LifeCycleBean bean = (LifeCycleBean) ac.getBean("lifeCycleBean");
		System.out.println(bean.getName());
		// ApplicationContext 中没有close方法，但是ClassPathXmlApplicationContext 中有，可以先强转再调用
		((ClassPathXmlApplicationContext)ac).close();
	}

}
