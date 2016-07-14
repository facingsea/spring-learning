package com.facingsea.springexercise.h_aspectj.annotation.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 前置增强方法测试
 * @author wangzhf
 *
 */
@Component
@Aspect
public class ABeforeAdvice {
	
	public ABeforeAdvice() {
		System.out.println("abeforeadvice constructor ... ");
	}
	
	/**
	 * 拦截对应Bean的全部方法
	 */
	@Before(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.ABeforeBean.*(..))")
	public void beforeTask(){
		System.out.println("beforeTask ... ");
	}
	
	/**
	 * 拦截对应Bean以delete开头的方法
	 * 可以在方法中传入JoinPoint对象，用来获得切点信息
	 * @param jp
	 */
	@Before(value = "execution(* com.facingsea.springexercise.h_aspectj.annotation.beans.ABeforeBean.delete*(..))")
	public void beforeTask2(JoinPoint jp){
		System.out.println("beforeTask2 ... ");
		System.out.println(jp.toString());
	}

}
