package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AAfterAdvice {

	@After(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterBean.*(..))")
	public void after1(JoinPoint jp) {
		System.out.println("after1 ... ");
	}

}
