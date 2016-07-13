package com.facingsea.springexercise.g_aop.gd_auto_proxy;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.g_aop.gd_auto_proxy.beans.ServiceBean;
import com.facingsea.springexercise.g_aop.gd_auto_proxy.beans.ServiceBean2;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class AutoProxyTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/g_aop/gd_auto_proxy/res/gd_beans.xml");
		
		//ServiceBean sb = (ServiceBean) ac.getBean("serviceBean");
		//sb.init();
		//sb.service();
		//sb.destory();
		//System.out.println(sb.getClass().getName()); // cglib
		
		System.out.println("==================");
		ServiceBean2 sb2 = (ServiceBean2) ac.getBean("serviceBean2");
		sb2.init();
		sb2.service();
		sb2.destory();
		System.out.println(sb2.getClass().getName());
		
		ApplicationContextUtil.close(ac);
	}

}
