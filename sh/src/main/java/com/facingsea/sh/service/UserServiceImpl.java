package com.facingsea.sh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facingsea.sh.dao.UserDAO;
import com.facingsea.sh.domain.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void saveUser(User user) {
		userDAO.save(user);
	}

}
