package com.facingsea.springexercise.f_annotation.fb_di;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.f_annotation.fb_di.beans.UserService;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class FBDITest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/f_annotation/fb_di/res/fb_beans.xml");
		
		UserService service = (UserService) ac.getBean("userService");
		service.save();
		service.save2();
		
		ApplicationContextUtil.close(ac);
	}

}
