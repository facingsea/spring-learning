package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AAfterThrowingAdvice {

	/**
	 * 只有被拦截的方法抛异常时才会执行，如果没有异常将不会执行。
	 * @param jp
	 * @param ex
	 */
	@AfterThrowing(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterThrowingBean.*(..))", 
			throwing = "ex")
	public void afterThrowing1(JoinPoint jp, Throwable ex) {
		System.out.println("afterThrowing ... ");
	}

}
