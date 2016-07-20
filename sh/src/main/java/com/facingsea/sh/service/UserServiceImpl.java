package com.facingsea.sh.service;

import org.springframework.stereotype.Service;

import com.facingsea.sh.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public void saveUser(User user) {
		System.out.println("User Service 执行了。。。");
	}

}
