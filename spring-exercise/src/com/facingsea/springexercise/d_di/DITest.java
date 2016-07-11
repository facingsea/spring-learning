package com.facingsea.springexercise.d_di;

import org.springframework.context.ApplicationContext;

import com.facingsea.springexercise.d_di.bean.ComplexBean1;
import com.facingsea.springexercise.d_di.bean.DBean1;
import com.facingsea.springexercise.d_di.bean.DBean2;
import com.facingsea.springexercise.zz_utils.ApplicationContextUtil;

public class DITest {
	
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil.getApplicationContext("classpath:com/facingsea/springexercise/d_di/res/d_beans.xml");
		DBean1 b1 = (DBean1) ac.getBean("dBean1");
		System.out.println("=====bean1: construct di=====");
		System.out.println(b1.getName() + " ==> " + b1.getAge());
		
		DBean2 b2 = (DBean2) ac.getBean("dBean2");
		System.out.println("=====bean2: setter method di=====");
		System.out.println(b2.getName() + " ==> " + b2.getAge());
		
		
		System.out.println("=====complex bean test.=======");
		ComplexBean1 cb1 = (ComplexBean1) ac.getBean("cb1");
		System.out.println(cb1.getName());
		System.out.println(cb1.getCb2().getName());
		System.out.println(cb1.getCb2().hashCode()); //1
		System.out.println(cb1.getCb2().hashCode()); //2
		
		// 1和2输出的值不一样。
		
		ApplicationContextUtil.close(ac);
	}

}
