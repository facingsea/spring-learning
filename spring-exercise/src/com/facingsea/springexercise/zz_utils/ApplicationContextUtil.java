package com.facingsea.springexercise.zz_utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil {
	
	public static ApplicationContext getApplicationContext(String path){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(path);
		return ac;
	}
	
	public static void close(ApplicationContext ac){
		if(ac instanceof ClassPathXmlApplicationContext){
			((ClassPathXmlApplicationContext) ac).close();
		}
	}
	

}
