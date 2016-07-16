package com.facingsea.springexercise.j_tx.declarative.xml;

import java.util.UUID;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.j_tx.declarative.xml.domain.DXUser;
import com.facingsea.springexercise.j_tx.declarative.xml.service.DXUserService;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class DXTXTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/j_tx/declarative/xml/res/beans.xml");
		
		DXUserService service = (DXUserService) ac.getBean("dxUserService");
		DXUser user = new DXUser();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setName("王五");
		user.setAge(25);
		user.setAddress("北京市东城区");
		
		service.save(user);
		
		ApplicationContextUtil.close(ac);
	}

}
