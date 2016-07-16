package com.facingsea.springexercise.i_jdbc_tmp;

import java.util.UUID;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.i_jdbc_tmp.domain.User;
import com.facingsea.springexercise.i_jdbc_tmp.service.UserService;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class JDBCTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/i_jdbc_tmp/res/beans.xml");
		
		UserService userService = (UserService) ac.getBean("userService");
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setName("zhangsan");
		user.setAge(20);
		user.setAddress("北京市海淀区");
		
		userService.save(user);
		
		ApplicationContextUtil.close(ac);
	}

}
