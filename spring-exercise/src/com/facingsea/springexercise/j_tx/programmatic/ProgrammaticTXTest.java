package com.facingsea.springexercise.j_tx.programmatic;

import java.util.UUID;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.j_tx.programmatic.domain.User;
import com.facingsea.springexercise.j_tx.programmatic.service.UserService;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

/**
 * 编程式事务测试
 * @author wangzhf
 *
 */
public class ProgrammaticTXTest {

	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/j_tx/programmatic/res/beans.xml");
		
		UserService userService = (UserService) ac.getBean("userService");
		User user = new User();
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setName("lisi");
		user.setAge(25);
		user.setAddress("北京市朝阳区");
		
		userService.save(user);
		
		ApplicationContextUtil.close(ac);
	}
}
