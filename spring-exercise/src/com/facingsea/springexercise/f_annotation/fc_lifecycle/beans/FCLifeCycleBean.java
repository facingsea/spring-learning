package com.facingsea.springexercise.f_annotation.fc_lifecycle.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;

@Controller("fcLifeCycleBean")
public class FCLifeCycleBean {
	
	// init
	@PostConstruct
	public void init(){
		System.out.println("life cycle init ... ");
	}
	
	public void service(){
		System.out.println("service run ... ");
	}
	
	// destory
	@PreDestroy
	public void destory(){
		System.out.println("life cycle destory ... ");
	}

}
