package com.facingsea.springexercise.f_annotation.fe_junit.beans;

import org.springframework.stereotype.Controller;

@Controller
public class HelloService {
	
	public void sayHello(){
		System.out.println("hello spring ... ");
	}

}
