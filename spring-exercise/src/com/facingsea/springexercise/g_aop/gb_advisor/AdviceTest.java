package com.facingsea.springexercise.g_aop.gb_advisor;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.g_aop.gb_advisor.beans.CustomerService;
import com.facingsea.springexercise.g_aop.gb_advisor.beans.UserServiceImpl;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class AdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/g_aop/gb_advisor/res/gb_beans.xml");
		
		CustomerService service = (CustomerService) ac.getBean("customerServiceProxy");
		service.save();
		service.delete();
		System.out.println(service.getClass().getName());
		
		System.out.println("======================");
		UserServiceImpl us = (UserServiceImpl) ac.getBean("userServiceProxy");
		us.deleteUser();
		System.out.println(us.getClass().getName());
		
		ApplicationContextUtil.close(ac);
	}

}
