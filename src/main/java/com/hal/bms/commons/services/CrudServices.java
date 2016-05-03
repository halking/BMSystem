/**
 * 
 */
package com.hal.bms.commons.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.commons.entity.DataEntity;
import com.hal.bms.commons.util.Page;
import com.hal.bms.entity.User;

/**
 * @author hal
 * @param <T>
 *
 */
public abstract class CrudServices<D extends BaseHibernateDAO<T>, T extends DataEntity<T>> extends BaseServices<T,Page>{
  
	@Autowired
	protected D dao;

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public   T get(Integer id) {
		return dao.get(id);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public List<T> getId(Integer id) {
		return dao.getId(id);
	}

	/**
	 * @param id
	 * @return
	 */
	public List<T> findAll(T entity) {
		return dao.queryAll(entity);
	}

	/**
	 * * @param id
	 * 
	 * @return
	 */
	public List<T> findByName(String name) {
		return dao.queryByName(name);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	/**
	 * 
	 * @param entity
	 * @return
	 */
	public void saveEntity(T entity) {
		dao.insert(entity);
	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public  void updateById(Integer id,T entity) {
		   dao.updateByID(id,entity);
	}
 
	public List<T> getAll() {
		return dao.getAll();
	}
}
