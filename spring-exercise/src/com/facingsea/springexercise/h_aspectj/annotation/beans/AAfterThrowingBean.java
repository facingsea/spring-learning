package com.facingsea.springexercise.h_aspectj.annotation.beans;

import org.springframework.stereotype.Component;

@Component("aAfterThrowingBean")
public class AAfterThrowingBean {
	
	public void saveBean(){
		System.out.println("save bean run ... ");
	}
	
	public boolean deleteBean(){
		System.out.println("delete bean run ... ");
		int i = 1 + 1;
		if(i == 2){
			// 暂时注释，否则影响后面的测试
			// throw new RuntimeException("The perfect result...");
		}
		return true;
	}

}
