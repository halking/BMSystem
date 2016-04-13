/**
 * 
 */
package com.hal.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hal.bms.commons.services.CrudServices;
import com.hal.bms.commons.util.Page;
import com.hal.bms.dao.CategoryDao;
import com.hal.bms.entity.Category;

/**
 * @author hal
 *
 */
@Service
public class CategoryServices extends CrudServices<CategoryDao, Category> {

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.services.BaseServices#queryByPage(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param page
	 *@return
	 */
	@Override
	public List<Category> queryByPage(Category entity, Page page) {
		// TODO Auto-generated method stub
		return null;
	}

}
