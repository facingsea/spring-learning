package com.facingsea.springexercise.g_aop.gb_advisor.advice;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class TimeIntroductionInterceptor extends DelegatingIntroductionInterceptor
				implements TimeMonitorable{

	private boolean active;

	@Override
	public void setMonitorAdvice(boolean active) {
		this.active = active;
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object ret = null;
		if(active){
			ret = super.invoke(mi);
		}else{
			System.out.println("开始时间：" + System.currentTimeMillis());
			ret = super.invoke(mi);
			System.out.println("结束时间：" + System.currentTimeMillis());
		}
		return ret;
	}

}
