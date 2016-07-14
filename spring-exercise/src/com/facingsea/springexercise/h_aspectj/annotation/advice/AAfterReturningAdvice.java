package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AAfterReturningAdvice {

	@AfterReturning(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterReturningBean.*(..))")
	public void afterReturning1() {
		System.out.println("afterReturning1 ... ");
	}

	/**
	 * returning将获取方法执行的返回值，如果没有，则为null，如果有，将会把该返回值传递给方法列表中与returning
	 * 指定的值相同的参数
	 * @param jp
	 * @param ret 
	 */
	@AfterReturning(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterReturningBean.delete*(..))", 
			returning = "ret")
	public void afterReturning2(JoinPoint jp, Object ret) {
		System.out.println("afterReturning2: ");
		System.out.println(jp.toString());
		System.out.println(ret.toString());
	}
}
