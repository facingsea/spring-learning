package com.facingsea.springexercise.f_annotation.fb_di.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	/**
	 * 
	 *  @Autowired 默认按照类型进行注入, 如果存在两个相同Bean类型相同，则按照名称注入
		@Autowired 注入时可以针对成员变量或者setter方法

	 *  通过@Autowired的required属性，设置一定要找到匹配的Bean
	          使用@Qualifier指定注入Bean的名称

	          使用Qualifier 指定Bean名称后，注解Bean必须指定相同名称

	 * 
	 */
	
	@Autowired(required = true)
	@Qualifier("userDAO")
	private UserDAO userDAO;
	
	
	/**
	 *  @Resource 和 @Autowired 注解功能相似
	 * 
	 */
	@Resource
	private UserDAO2 userDAO2;
	
	public void save(){
		System.out.println("save service run ... ");
		userDAO.save();
	}
	
	public void save2(){
		System.out.println("save2 service run .... ");
		userDAO2.save();
	}

}
