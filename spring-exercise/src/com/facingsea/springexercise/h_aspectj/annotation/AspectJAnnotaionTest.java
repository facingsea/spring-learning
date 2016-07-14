package com.facingsea.springexercise.h_aspectj.annotation;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterBean;
import com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterReturningBean;
import com.facingsea.springexercise.h_aspectj.annotation.beans.AAfterThrowingBean;
import com.facingsea.springexercise.h_aspectj.annotation.beans.AAroundBean;
import com.facingsea.springexercise.h_aspectj.annotation.beans.ABeforeBean;
import com.facingsea.springexercise.h_aspectj.annotation.beans.APointcutBean;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class AspectJAnnotaionTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil
				.getApplicationContext("classpath:com/facingsea/springexercise/h_aspectj/annotation/res/ha_beans.xml");
		
		// ================== before ======================
		
		ABeforeBean abb = (ABeforeBean) ac.getBean("aBeforeBean");
		System.out.println("----------");
		abb.saveBean();
		System.out.println("----------");
		abb.deleteBean();
		System.out.println("----------");
		System.out.println(abb.getClass().getName());
		
		System.out.println("=======================");
		
		//================= after =================
		
		AAfterReturningBean arb = (AAfterReturningBean) ac.getBean("aAfterReturningBean");
		System.out.println("----------");
		arb.saveBean();
		System.out.println("----------");
		arb.deleteBean();
		System.out.println("----------");
		System.out.println(arb.getClass().getName());
		
		System.out.println("=======================");
		
		// ================== around ====================
		
		AAroundBean aab = (AAroundBean) ac.getBean("aAroundBean");
		System.out.println("----------");
		aab.saveBean();
		System.out.println("----------");
		aab.deleteBean();
		System.out.println("----------");
		System.out.println(aab.getClass().getName());
		
		System.out.println("=======================");
		
		// ================== afterThrowing =====================
		AAfterThrowingBean atb = (AAfterThrowingBean) ac.getBean("aAfterThrowingBean");
		atb.deleteBean();
		System.out.println(atb.getClass().getName());
		
		System.out.println("=======================");
		
		// ================== after =====================
		AAfterBean afterBean = (AAfterBean) ac.getBean("aAfterBean");
		afterBean.deleteBean();
		System.out.println(afterBean.getClass().getName());
		
		System.out.println("=======================");
		
		// ================== pointcut =====================
		APointcutBean apb = (APointcutBean) ac.getBean("aPointcutBean");
		apb.deleteBean();
		System.out.println(apb.getClass().getName());
		
		ApplicationContextUtil.close(ac);
	}

}
