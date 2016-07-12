package com.facingsea.springexercise.f_annotation.fa_warm;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.f_annotation.fa_warm.beans.FAWarmBean;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class FAWarmTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/f_annotation/fa_warm/res/fa_beans.xml");
		
		FAWarmBean fab = (FAWarmBean) ac.getBean("faWarmBean");
		fab.warm();
		
		ApplicationContextUtil.close(ac);
	}

}
