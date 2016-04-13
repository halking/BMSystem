/**
 * 
 */
package com.hal.bms.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.entity.Organization;

/**
 * @author hal
 *
 */
@Repository
public class OrganizationDao extends BaseHibernateDAO<Organization> {

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#get(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@Override
	public Organization get(Organization entity) {
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
	public List<Organization> getId(Integer id) {
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
	public List<Organization> queryByName(String name) {
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
	public List<Organization> queryAll(Organization entity) {
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
	public void deleteByEntity(Organization entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#updateByID(java.lang.Integer, java.lang.Object)
	 *@param id
	 *@param entity
	 */
	@Override
	public void updateByID(Integer id, Organization entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#insert(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void insert(Organization entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#getAll()
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Organization> getAll() {
		// TODO Auto-generated method stub
	        String hql = "From Organization";	
			return exeQuery(hql).list();
	}

}
