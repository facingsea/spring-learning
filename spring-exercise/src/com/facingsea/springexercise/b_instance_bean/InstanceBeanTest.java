package com.facingsea.springexercise.b_instance_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.facingsea.springexercise.b_instance_bean.beans.Person;
import com.facingsea.springexercise.b_instance_bean.beans.Person2;

public class InstanceBeanTest {
	
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/facingsea/springexercise/b_instance_bean/res/beans.xml");
//		Person p = (Person) ac.getBean("person");
//		System.out.println(p.getAge());
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/facingsea/springexercise/b_instance_bean/res/beans.xml");
//		Person2 p2 = (Person2) ac.getBean("person2");
//		System.out.println(p2.getAge());
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:com/facingsea/springexercise/b_instance_bean/res/beans.xml");
		Person2 p2 = (Person2) ac.getBean("person3");
		System.out.println(p2.getAge());
		
		((ClassPathXmlApplicationContext) ac).close();
	}

}
