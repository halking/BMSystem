/**
 * 
 */
package com.hal.bms.commons.services;

import java.util.List;

import com.hal.bms.commons.entity.DataEntity;
import com.hal.bms.entity.Type;

/**
 * @author hal
 *
 */
public interface IbaseServices <T,E extends DataEntity<Type>>{
	   /**
     * 分类查询
     * @param entity
     * @param type
     * @return
     */
    public  List<T>  queryBytype(String entity);
}
