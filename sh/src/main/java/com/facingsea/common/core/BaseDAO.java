package com.facingsea.common.core;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;

/**
 * DAO公共接口定义
 * @author wangzhf
 *
 * @param <T>		实体类
 * @param <ID>		主键
 */
public interface BaseDAO<T, ID extends Serializable> {
	
	/**
	 * 保存
	 * @param entity
	 */
	public Serializable save(T entity);
	
	/**
	 * 更新
	 * @param entity
	 */
	public void update(T entity);
	
	/**
	 * 根据id更新
	 * @param hql
	 * @param parames
	 * @param isHQL
	 * @return
	 */
	public int updateEntityById(String hql, Map<String, Object> parames, boolean isHQL);
	
	/**
	 * 删除
	 * @param entity
	 */
	public void deleteEntity(T entity);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(ID id);
	
	/**
	 * 根据id获取实体
	 * @param id
	 * @return
	 */
	public T get(ID id);
	
	/**
	 * 根据id获取实体
	 * @param id
	 * @param lock 是否锁定，使用 LockMode.UPGRADE
	 * @return
	 */
	public T get(ID id, boolean lock);
	
	/**
	 * 从session缓存中清除实体
	 * @param entity
	 */
	public void evit(T entity);
	
	/**
	 * 使用HQL 查询所有
	 * @param hql 
	 * @param parames 对应sql中需要填充的参数
	 * @return
	 */
	public List<T> queryAll(String hql, Map<String, Object> parames);
	
	/**
	 * 使用sql查询，该方法没有填充参数
	 * @param sql
	 * @return
	 */
	public List<T> findEntityBySQL(String sql);
	
	/**
	 * 使用sql查询，需要填充参数
	 * @param sql
	 * @param parames 对应sql中需要填充的参数
	 * @return
	 */
	public List<T> findEntityBySQL(String sql, Map<String, Object> parames);
	
	/**
	 * 使用hql查询唯一结果
	 * @param hql
	 * @param parames 对应hql中需要填充的参数
	 * @return
	 */
	public T getUniqueResultByHQL(String hql, Map<String, Object> parames);
	
	/**
	 * 使用sql查询唯一结果
	 * @param sql
	 * @param parames 对应sql中需要填充的参数
	 * @return
	 */
	public T getUniqueResultBySQL(String sql, Map<String, Object> parames);
	
	/**
	 * 根据单个属性查询所有实体
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public List<T> findEntityByProperty(String propertyName, Object value);
	
	/**
	 * 根据属性查询唯一结果，如果有多个，将返回第一个
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public T findUniqueResultByProperty(String propertyName, Object value);

	/**
	 * 根据属性统计记录数
	 * @param propertyName
	 * @param value
	 * @return
	 */
	public Long countByProperty(String propertyName, Object value);
	
	/**
	 * 使用Criteria查询
	 * @param criteria 条件
	 * @return
	 */
	public List<T> findEntityByCriteria(Criteria... criteria);
	
	/**
	 * 创建Criteria对象
	 * @param criterias
	 * @return
	 */
	Criteria createCriteria(Criteria... criterias);
	
}
