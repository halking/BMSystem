/**
 * 
 */
package com.hal.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hal.bms.commons.services.CrudServices;
import com.hal.bms.commons.util.Page;
import com.hal.bms.dao.BooksDao;
import com.hal.bms.dao.TypeDao;
import com.hal.bms.entity.Type;

/**
 * @author hal
 *
 */
@Service
public class TypeServices extends CrudServices<TypeDao, Type> {
	
	/* 
	 *2016年4月10日
	 * @see com.hal.bms.commons.services.BaseServices#queryByPage(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param page
	 *@return
	 */
	@Override
	public List<Type> queryByPage(Type entity, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

}
