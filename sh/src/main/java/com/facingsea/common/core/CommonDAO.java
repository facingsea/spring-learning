package com.facingsea.common.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;

/**
 * 基类的基本实现
 * @author wangzhf
 *
 * @param <T>
 * @param <ID>
 */
public class CommonDAO<T, ID extends Serializable> implements BaseDAO<T, Serializable> {

	@Override
	public void save(T entity) {
		
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateEntityById(String hql, Map<String, Object> parames, boolean isHQL) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteEntity(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(Serializable id, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void evit(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> queryAll(String hql, Map<String, Object> parames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findEntityBySQL(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findEntityBySQL(String sql, Map<String, Object> parames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getUniqueResultByHQL(String hql, Map<String, Object> parames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getUniqueResultBySQL(String sql, Map<String, Object> parames) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findEntityByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findUniqueResultByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findEntityByCriteria(Criteria... criteria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria createCriteria(Criteria... criterias) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
