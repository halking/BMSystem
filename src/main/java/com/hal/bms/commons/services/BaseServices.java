/**
 * 
 */
package com.hal.bms.commons.services;

import java.util.List;

import com.hal.bms.commons.entity.DataEntity;


/**
 * @author hal
 *
 */
public abstract class BaseServices <T, E>{
	  /**
     * 分页查询
     * @param entity
     * @param page
     * @return
     */
    public  abstract List<T>  queryByPage(T entity,E page) ;
 
}
