package com.facingsea.springexercise.f_annotation.fb_di.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO2 {

	public void save(){
		System.out.println("user dao2 run ... ");
	}
}
