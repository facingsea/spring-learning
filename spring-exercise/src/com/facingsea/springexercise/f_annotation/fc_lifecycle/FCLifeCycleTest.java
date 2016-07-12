package com.facingsea.springexercise.f_annotation.fc_lifecycle;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.f_annotation.fc_lifecycle.beans.FCLifeCycleBean;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class FCLifeCycleTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/f_annotation/fc_lifecycle/res/fc_beans.xml");
		System.out.println("after init ... ");
		FCLifeCycleBean bean = (FCLifeCycleBean) ac.getBean("fcLifeCycleBean");
		bean.service();
		
		ApplicationContextUtil.close(ac);
	}

}
