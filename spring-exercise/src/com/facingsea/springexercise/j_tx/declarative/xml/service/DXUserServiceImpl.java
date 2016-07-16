package com.facingsea.springexercise.j_tx.declarative.xml.service;

import java.util.UUID;

import com.facingsea.springexercise.j_tx.declarative.xml.dao.DXUserDAO;
import com.facingsea.springexercise.j_tx.declarative.xml.domain.DXUser;

public class DXUserServiceImpl implements DXUserService {

	private DXUserDAO dxUserDAO;
	
	@Override
	public void save(DXUser dxUser) {
		dxUserDAO.save(dxUser);
		int i = 0;
		int j = i + 0;
		int k = 3 / j;
		dxUser.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		dxUserDAO.save(dxUser);
	}

	public DXUserDAO getDxUserDAO() {
		return dxUserDAO;
	}

	public void setDxUserDAO(DXUserDAO dxUserDAO) {
		this.dxUserDAO = dxUserDAO;
	}
	

}
