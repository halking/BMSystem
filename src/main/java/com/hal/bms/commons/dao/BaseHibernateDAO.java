package com.hal.bms.commons.dao;
// default package

import com.hal.bms.commons.util.HibernateSessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
@Repository
public abstract class BaseHibernateDAO<T>  implements CrudDao<T>{
	
	@Autowired
	protected SessionFactory sessionFactory;
		
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return   sessionFactory.getCurrentSession();
	}
	public  Query  exeQuery(String hqlString){
	    return  getSession().createQuery(hqlString);
	}
}