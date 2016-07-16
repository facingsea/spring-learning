package com.facingsea.springexercise.j_tx.declarative.xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.facingsea.springexercise.j_tx.declarative.xml.domain.DXUser;

public class DXUserDAOImpl implements DXUserDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public void save(DXUser dxUser) {
		String sql = "insert into user(id, name, age, address) values (?, ?, ?, ?)";
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(sql, dxUser.getId(), dxUser.getName(), dxUser.getAge(), dxUser.getAddress());
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
