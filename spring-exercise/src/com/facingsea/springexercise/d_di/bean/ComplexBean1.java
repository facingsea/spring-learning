package com.facingsea.springexercise.d_di.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 测试复杂对象注入问题
 * 
 * 本例子，该对象为singleton
 * @author wangzhf
 *
 */
public class ComplexBean1 implements ApplicationContextAware {
	
	private ApplicationContext context;
	
	private String name = "c1";
	
	private ComplexBean2 cb2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ComplexBean2 getCb2() {
		return (ComplexBean2) context.getBean("cb2");
	}

	public void setCb2(ComplexBean2 cb2) {
		this.cb2 = cb2;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

}
