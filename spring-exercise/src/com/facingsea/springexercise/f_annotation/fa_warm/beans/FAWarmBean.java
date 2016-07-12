package com.facingsea.springexercise.f_annotation.fa_warm.beans;

import org.springframework.stereotype.Component;

@Component("faWarmBean")
public class FAWarmBean {

	public void warm(){
		System.out.println("warm run ... ");
	}
}
