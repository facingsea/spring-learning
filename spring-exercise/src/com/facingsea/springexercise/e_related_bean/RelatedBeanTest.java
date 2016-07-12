package com.facingsea.springexercise.e_related_bean;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.e_related_bean.beans.ExtendBeanChild01;
import com.facingsea.springexercise.e_related_bean.beans.ExtendBeanChild02;
import com.facingsea.springexercise.e_related_bean.beans.Student;
import com.facingsea.springexercise.e_related_bean.beans.TaskManager;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class RelatedBeanTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/e_related_bean/res/e_beans.xml");
		
		//=========== extend =============
		
		ExtendBeanChild01 c1 = (ExtendBeanChild01) ac.getBean("extendBeanChild01");
		System.out.println("c1: " + c1.getName());
		System.out.println("c1: " + c1.getAge());
		
		ExtendBeanChild02 c2 = (ExtendBeanChild02) ac.getBean("extendBeanChild02");
		System.out.println("c2: " + c2.getName());
		System.out.println("c2: " + c2.getAddress());
		
		
		// ========= depend ==========
		TaskManager tm = (TaskManager) ac.getBean("taskManager");
		tm.run();
		
		// ========= reference ========
		Student stu = (Student) ac.getBean("student");
		stu.readBook();
		
		
		ApplicationContextUtil.close(ac);
	}

}
