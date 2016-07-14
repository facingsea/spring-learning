package com.facingsea.springexercise.h_aspectj.xml.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class XAspect {
	
	/**
	 * 前置
	 * @param jp
	 */
	public void before(JoinPoint jp){
		System.out.println("xml before ... ");
	}
	
	/**
	 * 后置返回
	 * @param jp
	 * @param retVal
	 */
	public void afterReturning(JoinPoint jp, Object retVal){
		System.out.println("xml afterReturning ... ");
		System.out.println(retVal);
	}
	
	/**
	 * 环绕
	 * @param jp
	 * @return
	 * @throws Throwable
	 */
	public Object around(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("xml around before ... ");
		Object ret = jp.proceed();
		System.out.println("xml around after ... ");
		return ret;
	}
	
	/**
	 * 抛出异常
	 * @param jp
	 * @param ex
	 */
	public void afterThrowing(JoinPoint jp, Throwable ex){
		System.out.println("发生异常：" + ex.getMessage());
	}
	
	/**
	 * 后置
	 * @param jp
	 */
	public void after(JoinPoint jp){
		System.out.println("xml after ... ");
	}

}
