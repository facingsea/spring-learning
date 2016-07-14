package com.facingsea.springexercise.h_aspectj.annotation.beans;

import org.springframework.stereotype.Component;

@Component("aAroundBean")
public class AAroundBean {
	
	public void saveBean(){
		System.out.println("save bean run ... ");
	}
	
	public boolean deleteBean(){
		System.out.println("delete bean run ... ");
		return true;
	}

}
