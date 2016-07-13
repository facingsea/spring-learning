package com.facingsea.springexercise.g_aop.gb_advisor.beans;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save() {
		System.out.println("save run ... ");
	}

	@Override
	public void delete() {
		System.out.println("delete run ... ");
	}
	
	

}
