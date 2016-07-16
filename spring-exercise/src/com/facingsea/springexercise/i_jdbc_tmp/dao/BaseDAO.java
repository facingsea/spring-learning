package com.facingsea.springexercise.i_jdbc_tmp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDAO  {

	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
}
