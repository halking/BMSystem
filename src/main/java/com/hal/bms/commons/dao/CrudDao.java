package com.hal.bms.commons.dao;

import java.util.List;

import com.hal.bms.entity.Books;

public interface CrudDao<T> extends IBaseHibernateDAO{
     /**
      *  得到实体       
      * @param entity
      * @return
      */
     public T get(Integer id);
     /**
      * 得到实体ID
      * @param id
      * @return
      */
     public List<T> getId(Integer  id);
     /**
      * ͨ通过名称查询
      * @param entity
      * @return
      */
     public List<T> queryByName(String name);
     /**
      * 查询出所有记录
      * @param entity
      * @return
      */
     public  List<T>  queryAll(T entity);
     /**
      * 通过id删除数据
      * @param id
      */
     public void deleteById(Integer id);
     /**
      * 通过实体直接删除数据
      * @param entity
      */
     public  void deleteByEntity(T entity);
     /**
      *通过id更新数据
      * @param id
      */
     public    void updateByID(Integer id,T entity);
     /**
      * 插入一条数据
      * @param id
      */
     public   void insert(T  entity);
     /**
      * 查询所有
      */
     public   List<T> getAll() ;
}
