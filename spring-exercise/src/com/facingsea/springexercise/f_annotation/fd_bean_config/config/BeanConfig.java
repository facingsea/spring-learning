package com.facingsea.springexercise.f_annotation.fd_bean_config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.facingsea.springexercise.f_annotation.fd_bean_config.beans.OrderDAO;
import com.facingsea.springexercise.f_annotation.fd_bean_config.beans.ProductDAO;

/**
 * 使用此Bean来代替xml文件定义Bean
 * @author wangzhf
 *
 */
@Configuration
public class BeanConfig {
	/**
	 * 如果 @Bean 中没有指定name，将会使用该方法名作为该bean的id
	 * @return
	 */
	@Bean(initMethod = "init", destroyMethod = "destory")
	public ProductDAO getProductDAO(){
		return new ProductDAO();
	}
	
	@Bean(name = "oDAO")
	public OrderDAO getOrderDAO(){
		return new OrderDAO();
	}

}
