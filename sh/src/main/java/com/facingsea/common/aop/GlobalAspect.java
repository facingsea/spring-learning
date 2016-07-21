package com.facingsea.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 全局切面
 * @author wangzhf
 *
 */
public class GlobalAspect {
	
	private static Logger log = LoggerFactory.getLogger(GlobalAspect.class);
	
	/**
	 * 统计Action中方法运行时间
	 * @param jp
	 * @return
	 * @throws Throwable 
	 */
	public Object measureTime(ProceedingJoinPoint jp) throws Throwable{
		String name = jp.getSignature().getName();
		String clsName = jp.getTarget().getClass().getName();
		log.info(clsName + "." + name + " will start ... ");
		long start = System.currentTimeMillis();
		
		Object obj = jp.proceed();
		
		long end = System.currentTimeMillis();
		log.info(clsName + "." + name + " finished, it takes " + (end - start ) + " millisecond.");
		return obj;
	}

}
