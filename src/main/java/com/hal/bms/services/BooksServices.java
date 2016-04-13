/**
 * 
 */
package com.hal.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hal.bms.commons.services.CrudServices;
import com.hal.bms.commons.services.IbaseServices;
import com.hal.bms.commons.util.Page;
import com.hal.bms.dao.BooksDao;
import com.hal.bms.entity.Books;
import com.hal.bms.entity.Type;

/**
 * @author hal
 *
 */
@Service
public class BooksServices extends CrudServices<BooksDao, Books>  implements IbaseServices<Books,Type>{

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.services.BaseServices#queryByPage(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param page
	 *@return
	 */
	@Override
	public List<Books> queryByPage(Books entity, Page page) {
		// TODO Auto-generated method stub
		  List<Books>  list =    dao.queryByPage(entity, page);
		return list;
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.services.IbaseServices#queryBytype(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param type
	 *@return
	 */
	@Override
	public List<Books> queryBytype(String type) {
		// TODO Auto-generated method stub
		List<Books>  list = dao.queryBytype(type);
		return list;
	}
     
}
