package com.facingsea.springexercise.j_tx.declarative.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.facingsea.springexercise.j_tx.declarative.annotation.domain.DAUser;

@Repository("daUserDAO")
public class DAUserDAOImpl implements DAUserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void save(DAUser user) {
		String sql = "insert into user(id, name, age, address) values (?, ?, ?, ?)";
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getAddress());
	}

}
