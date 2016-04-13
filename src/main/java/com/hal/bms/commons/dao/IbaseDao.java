/**
 * 
 */
package com.hal.bms.commons.dao;

import java.util.List;

/**
 * @author hal
 *
 */
public interface IbaseDao<T> {
	   /**
     * 分类查询
     * @param entity
     * @param type
     * @return
     */
    public  List<T>  queryBytype(String type);
}
