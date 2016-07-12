package com.facingsea.springexercise.f_annotation.fe_junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.facingsea.springexercise.f_annotation.fe_junit.beans.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/facingsea/springexercise/f_annotation/fe_junit/res/fe_beans.xml")
public class JunitTest {
	
	@Autowired
	private HelloService helloService;
	
	@Test
	public void run(){
		helloService.sayHello();
	}

}
