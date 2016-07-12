package com.facingsea.springexercise.f_annotation.fd_bean_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.facingsea.springexercise.f_annotation.fd_bean_config.beans.OrderDAO;
import com.facingsea.springexercise.f_annotation.fd_bean_config.beans.ProductDAO;
import com.facingsea.springexercise.f_annotation.fd_bean_config.config.BeanConfig;

public class BeanConfigTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(BeanConfig.class); // 相当于加载配置文件
		ac.refresh(); // 必须刷新，否则找不到配置的bean
		
		ProductDAO p = (ProductDAO) ac.getBean("getProductDAO");
		p.produce();
		
		OrderDAO o = (OrderDAO) ac.getBean("oDAO");
		o.doOrder();
		
		ac.close();
	}

}
