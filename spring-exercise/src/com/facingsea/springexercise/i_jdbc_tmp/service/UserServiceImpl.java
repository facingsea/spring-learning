package com.facingsea.springexercise.i_jdbc_tmp.service;

import com.facingsea.springexercise.i_jdbc_tmp.dao.UserDAO;
import com.facingsea.springexercise.i_jdbc_tmp.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	public void delete(String id) {
		userDAO.delete(id);
	}

	@Override
	public User find(String id) {
		return userDAO.find(id);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}


}
