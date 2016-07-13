package com.facingsea.springexercise.g_aop.gc_advisor.beans;

public class CustomDAO {
	
	public void save(){
		System.out.println("custom save run ... ");
	}
	
	public void delete(){
		System.out.println("custom delete run ... ");
	}
}
