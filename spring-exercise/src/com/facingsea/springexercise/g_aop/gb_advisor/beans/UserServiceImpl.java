package com.facingsea.springexercise.g_aop.gb_advisor.beans;

public class UserServiceImpl implements UserService {

	@Override
	public void saveUser() {
		System.out.println("save user run ... ");
	}

	@Override
	public void deleteUser() {
		System.out.println("delete user run ... ");
	}

}
