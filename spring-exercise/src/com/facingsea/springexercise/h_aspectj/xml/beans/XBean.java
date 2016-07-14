package com.facingsea.springexercise.h_aspectj.xml.beans;

public class XBean {
	
	public void saveBean(){
		System.out.println(" save bean ... ");
	}
	
	public boolean deleteBean(){
		System.out.println(" delete bean ... ");
		int i = 1 + 1;
		if(i == 2){
			//throw new RuntimeException("Perfect result...");
		}
		return true;
	}

}
