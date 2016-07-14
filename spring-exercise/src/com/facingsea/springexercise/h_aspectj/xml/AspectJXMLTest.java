package com.facingsea.springexercise.h_aspectj.xml;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.h_aspectj.xml.beans.XBean;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class AspectJXMLTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/h_aspectj/xml/res/xml_beans.xml");
		
		XBean xb = (XBean) ac.getBean("xBean");
		xb.deleteBean();
		
		ApplicationContextUtil.close(ac);
	}

}
