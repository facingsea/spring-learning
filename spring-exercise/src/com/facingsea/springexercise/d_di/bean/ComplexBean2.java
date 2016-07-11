package com.facingsea.springexercise.d_di.bean;

/**
 * 测试复杂对象注入问题
 * 
 * 本例中，该对象为prototype
 * @author wangzhf
 *
 */
public class ComplexBean2 {
	
	private String name = "c2";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
