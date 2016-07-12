package com.facingsea.springexercise.f_annotation.fb_di.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	public void save(){
		System.out.println("save dao run ... ");
	}

}
