package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Pointcut 用来定义切点表达式，方法体中的方法不执行，所以一般为空
 * @author wangzhf
 *
 */
@Component
@Aspect
public class APointcutAdvice {
	
	@Pointcut("execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.APointcutBean.*(..)))")
	public void pointcut1(){
	}
	
	@Pointcut("execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.APointcutBean.delete*(..)))")
	public void pointcut2(){
	}

	@After("pointcut1()")
	public void after1(JoinPoint jp) {
		System.out.println("pointcut after1 ... ");
	}

}
