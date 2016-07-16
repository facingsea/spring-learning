package com.facingsea.springexercise.j_tx.declarative.annotation.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.facingsea.springexercise.j_tx.declarative.annotation.dao.DAUserDAO;
import com.facingsea.springexercise.j_tx.declarative.annotation.domain.DAUser;

@Service("daUserService")
@Transactional(isolation = Isolation.DEFAULT, 
				propagation = Propagation.REQUIRED)
public class DAUserServiceImpl implements DAUserService {

	@Autowired
	private DAUserDAO daUserDAO;
	
	@Override
	public void save(DAUser user) {
		daUserDAO.save(user);
		int i = 0;
		int j = i + 0;
		int k = 3 / j;
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		daUserDAO.save(user);
	}

}
