/**
 * 
 */
package com.hal.bms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.entity.Type;

/**
 * @author hal
 *
 */
@Repository
public class TypeDao extends BaseHibernateDAO<Type> {

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#get(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@Override
	public Type get(Type entity) {
		// TODO Auto-generated method stub
		
		return null;
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#getId(java.lang.Integer)
	 *@param id
	 *@return
	 */
	@Override
	public List<Type> getId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#queryByName(java.lang.String)
	 *@param name
	 *@return
	 */
	@Override
	public List<Type> queryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#queryAll(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Type> queryAll(Type entity) {
		// TODO Auto-generated method stub
		String hql = "From Type";
		
		return getSession().createQuery(hql).list();
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteById(java.lang.Integer)
	 *@param id
	 */
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteByEntity(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void deleteByEntity(Type entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#updateByID(java.lang.Integer, java.lang.Object)
	 *@param id
	 *@param entity
	 */
	@Override
	public void updateByID(Integer id, Type entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.dao.CrudDao#insert(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void insert(Type entity) {
		// TODO Auto-generated method stub
		
	}
   
	@SuppressWarnings("unchecked")
	public List<Type> getAll() {
	       String hql = "From Type";	
		return exeQuery(hql).list();
	}
}
