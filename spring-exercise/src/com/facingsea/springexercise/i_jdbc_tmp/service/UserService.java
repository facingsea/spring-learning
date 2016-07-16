package com.facingsea.springexercise.i_jdbc_tmp.service;

import com.facingsea.springexercise.i_jdbc_tmp.domain.User;

public interface UserService {

	public void save(User user);
	public void update(User user);
	public void delete(String id);
	public User find(String id);
}
