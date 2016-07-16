package com.facingsea.springexercise.j_tx.declarative.annotation;

import java.util.UUID;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.j_tx.declarative.annotation.domain.DAUser;
import com.facingsea.springexercise.j_tx.declarative.annotation.service.DAUserService;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class DATXTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/j_tx/declarative/annotation/res/beans.xml");
		
		DAUserService service = (DAUserService) ac.getBean("daUserService");
		DAUser user = new DAUser();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setName("赵六");
		user.setAge(30);
		user.setAddress("北京市西城区");
		service.save(user);
		
		ApplicationContextUtil.close(ac);
	}

}
