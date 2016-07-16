package com.facingsea.springexercise.j_tx.programmatic.dao;

import com.facingsea.springexercise.j_tx.programmatic.domain.User;

public interface UserDAO {

	public void save(User user);
	public void update(User user);
	public void delete(String id);
	public User find(String id);
}
