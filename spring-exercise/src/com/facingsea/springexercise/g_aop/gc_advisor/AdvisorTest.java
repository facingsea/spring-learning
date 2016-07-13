package com.facingsea.springexercise.g_aop.gc_advisor;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.g_aop.gc_advisor.beans.CustomDAO;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class AdvisorTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/g_aop/gc_advisor/res/gc_beans.xml");
		
		CustomDAO cd = (CustomDAO) ac.getBean("customDAOProxy");
		cd.save();
		cd.delete();
		System.out.println(cd.getClass().getName());
		
		ApplicationContextUtil.close(ac);
	}

}
