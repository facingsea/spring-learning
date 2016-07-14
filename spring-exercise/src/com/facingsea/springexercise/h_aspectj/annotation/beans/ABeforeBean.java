package com.facingsea.springexercise.h_aspectj.annotation.beans;

import org.springframework.stereotype.Component;

@Component("aBeforeBean")
public class ABeforeBean {

	public void saveBean(){
		System.out.println("before: save bean run ... ");
	}
	
	public void deleteBean(){
		System.out.println("before: delete bean run ... ");
	}
}
