package com.facingsea.springexercise.j_tx.programmatic.service;

import java.util.UUID;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.facingsea.springexercise.j_tx.programmatic.dao.UserDAO;
import com.facingsea.springexercise.j_tx.programmatic.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	private TransactionTemplate transactionTemplate;

	@Override
	public void save(User user) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				userDAO.save(user);
				int i = 0;
				int j = i + 0;
				int k = 3 / j;
				user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
				userDAO.save(user);
			}
		});
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

	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}
