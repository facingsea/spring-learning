package com.facingsea.springexercise.j_tx.programmatic.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.facingsea.springexercise.j_tx.programmatic.domain.User;

public class UserDAOImpl implements UserDAO {
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(User user) {
		String sql = "insert into user(id, name, age, address) values (?, ?, ?, ?)";
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(sql, user.getId(), user.getName(), user.getAge(), user.getAddress());
	}

	@Override
	public void update(User user) {
		String sql = "update user set name = ?, age = ?, address = ? where id = ?";
		this.getJdbcTemplate().update(sql, user.getName(), user.getAge(), user.getAddress(), user.getId());
	}

	@Override
	public void delete(String id) {
		String sql = "delete from user where id = ?";
		this.getJdbcTemplate().update(sql, id);
	}

	@Override
	public User find(String id) {
		String sql = "select id, name, age, address from user where id = ? ";
		User user = this.getJdbcTemplate().queryForObject(sql, User.class, id);
		return user;
	}
	
}
