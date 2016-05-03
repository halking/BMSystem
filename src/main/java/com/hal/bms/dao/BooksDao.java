/**
 * 
 */
package com.hal.bms.dao;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hal.bms.commons.dao.BaseDao;
import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.commons.dao.IbaseDao;
import com.hal.bms.commons.util.Page;
import com.hal.bms.entity.Books;
import com.hal.bms.entity.Type;;

/**
 * @author hal
 *
 */
@Repository
public class BooksDao extends BaseHibernateDAO<Books> implements BaseDao<Books,Page>,
		IbaseDao<Books> {
	@Autowired
	TypeDao typedao;
	
	public  void updateEntity(Books books){
		getSession().setFlushMode(FlushMode.AUTO);
		  getSession().update(books);
		  getSession().flush();
	}
	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#get(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@Override
	public Books get(Integer id) {
		// TODO Auto-generated method stub
		return  (Books) getSession().load(Books.class, id);
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#getId(java.lang.String)
	 *@param id
	 *@return
	 */
	@Override
	public List<Books> getId(Integer id) {
		// TODO Auto-generated method stub
		String hql = "From Books where id =:di";
		Query query = exeQuery(hql);
		query.setInteger("di", id);
		List<Books> books = query.list();
		return books;
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#queryByName(java.lang.String)
	 *@param name
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Books> queryByName(String name) {
		// TODO Auto-generated method stub
		String hqlString = "From Books  as b where  b.bookname  like :bookname";
		Query query =exeQuery(hqlString);
		query.setString("bookname", "%"+name+"%");
		return  query.list();
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#queryAll(java.lang.Object)
	 *@param entity
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Books> queryAll(Books entity) {
		// TODO Auto-generated method stub
		String hql = "from Books";
		Query query = exeQuery(hql);
		List<Books>  list  =  query.list();
		return list;
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteById(java.lang.Integer)
	 *@param id
	 */
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		String hql = "delete Books where id=:id";
		Query query = exeQuery(hql);
		query.setInteger("id", id);
		query.executeUpdate();
		
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#deleteByEntity(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void deleteByEntity(Books entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#updateByID(java.lang.Integer)
	 *@param id
	 */
	@Override
	public void updateByID(Integer id,Books books) {
		// TODO Auto-generated method stub
		List<Type> list = typedao.getAll();
		Type type = new Type();
		for (Type types : list) {
			if (types.getTypename().equals(books.getType().getTypename())) {
				type = types;
			}
		}
		String hql = "update Books as b set b.bookname = :bn, b.img = :img,b.author=:author,b.hold = :hold,b.callnum=:callnum,"
				+ "b.isbn=:isbn,b.price=:price,b.creatdate=:creatdate,b.count=:count,b.type=:type,b.avilable=:avilable  where id = :id";
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		query.setString("bn", books.getBookname());
		query.setString("img", books.getImg());
		query.setString("author", books.getAuthor());
		query.setString("hold", books.getHold());
		query.setString("callnum", books.getCallnum());
		query.setString("isbn", books.getIsbn());
		query.setDouble("price", books.getPrice());
		query.setDate("creatdate", books.getCreatdate());
		query.setInteger("count", books.getCount());
		query.setInteger("type", type.getId());
		query.setShort("avilable", books.getAvilable());
		query.executeUpdate();
		
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.CrudDao#insert(java.lang.Object)
	 *@param entity
	 */
	@Override
	public void insert(Books entity) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.IbaseDao#queryBytype(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param type
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Books> queryBytype(String type) {
		// TODO Auto-generated method stub
		String hql = "From Books  as b where  b.type = (select id from Type as t where t.typename = :typename)";
		Query query = exeQuery(hql);
		query.setString("typename", type);
		return  query.list();
	}

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.dao.BaseDao#queryByPage(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param page
	 *@return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Books> queryByPage(Books entity, Page page) {
		// TODO Auto-generated method stub
		page = new Page();
		String hql = "from Books";
		Query query = exeQuery(hql);
		List<Books>  list  =  query.setFirstResult(page.getStart()).setMaxResults(page.getPerPagenum()).list();
		return list;
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#getAll()
	 *@return
	 */
	@Override
	public List<Books> getAll() {
		// TODO Auto-generated method stub
		return null;
	}	
}
