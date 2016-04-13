/**
 * 
 */
package com.hal.bms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.entity.Role;

/**
 * @author hal
 *
 */
@Repository
public class RoleDao extends BaseHibernateDAO<Role> {

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#get(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@Override
	public Role get(Role entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#getId(java.lang.Integer)
	 *@param id
	 *@return
	 */
	@Override
	public List<Role> getId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#queryByName(java.lang.String)
	 *@param name
	 *@return
	 */
	@Override
	public List<Role> queryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#queryAll(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@Override
	public List<Role> queryAll(Role entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteById(java.lang.Integer)
	 *@param id
	 */
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteByEntity(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void deleteByEntity(Role entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#updateByID(java.lang.Integer, java.lang.Object)
	 *@param id
	 *@param entity
	 */
	@Override
	public void updateByID(Integer id, Role entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#insert(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void insert(Role entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#getAll()
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		String hql = "From Role";
		return  exeQuery(hql).list();
	}
}
