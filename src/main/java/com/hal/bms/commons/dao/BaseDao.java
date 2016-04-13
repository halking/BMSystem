package com.hal.bms.commons.dao;

import java.util.List;

import com.hal.bms.commons.entity.DataEntity;
import com.hal.bms.commons.util.Page;

public interface BaseDao<T,E extends DataEntity<Page>> extends IBaseHibernateDAO {
    /**
     * 分页查询
     * @param entity
     * @param page
     * @return
     */
     public  List<T>  queryByPage(T entity,E page);
 
}
