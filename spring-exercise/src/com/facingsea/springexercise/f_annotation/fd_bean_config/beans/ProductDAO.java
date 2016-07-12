package com.facingsea.springexercise.f_annotation.fd_bean_config.beans;

public class ProductDAO {
	
	public ProductDAO() {
		System.out.println("product dao constructor ... ");
	}
	
	public void produce(){
		System.out.println("product dao run ... ");
	}

	public void init(){
		System.out.println("init ... ");
	}
	
	public void destory(){
		System.out.println("destory ... ");
	}
}
