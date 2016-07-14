package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AAroundAdvice {

	//@Around(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAroundBean.*(..))")
	//public void around1() {
	//	System.out.println("around1 ... ");
	//}

	/**
	 * 
	 * @param pjp
	 * @throws Throwable 
	 */
	@Around(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAroundBean.delete*(..))")
	public Object around2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around2: before");
		// System.out.println(pjp.toString());
		Object ret = pjp.proceed();
		System.out.println("around2: after");
		return ret;
	}
}
