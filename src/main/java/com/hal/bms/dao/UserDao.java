
package com.hal.bms.dao;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hal.bms.commons.dao.BaseHibernateDAO;
import com.hal.bms.entity.Category;
import com.hal.bms.entity.Organization;
import com.hal.bms.entity.Role;
import com.hal.bms.entity.User;

/**
 * @author hal
 *
 */
@Repository
public class UserDao extends BaseHibernateDAO<User> {
     @Autowired
	CategoryDao categorydao;
     @Autowired
     RoleDao roledao;
     @Autowired
     OrganizationDao orgdao;   
	Category category = new Category();	
	Role  role=new Role();
	Organization org  = new Organization();
	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#get(java.lang.Object)
	 * 
	 * @param entity
	 * 
	 * @return
	 */
	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		User user = (User)getSession().load(User.class, id);
		return  user;
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#getId(java.lang.Integer)
	 * 
	 * @param id
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getId(Integer id) {
		// TODO Auto-generated method stub
		String hql = "From User where id =:di";
		Query query = getSession().createQuery(hql);
		query.setInteger("di", id);
		List<User> users = query.list();
		return users;
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#queryByName(java.lang.String)
	 * 
	 * @param name
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryByName(String name) {
		// TODO Auto-generated method stub
		String hqlString = "From User  as ur where  ur.username  like :username";
		Query query = getSession().createQuery(hqlString);
		query.setString("user", "%"+name+"%");
		return  query.list();
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#queryAll(java.lang.Object)
	 * 
	 * @param entity
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> queryAll(User entity) {
		// TODO Auto-generated method stub
		String hql = "From User";
		Query query = getSession().createQuery(hql);
		List<User> list = query.list();
		return list;
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#deleteById(java.lang.Integer)
	 * 
	 * @param id
	 * 
	 * @return
	 */
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		String hql = "delete User where id =: id";
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#deleteByEntity(java.lang.Object)
	 * 
	 * @param entity
	 * 
	 * @return
	 */
	@Override
	public void deleteByEntity(User entity) {
		// TODO Auto-generated method stub
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#updateByID(java.lang.Integer)
	 * 
	 * @param id
	 * 
	 * @return
	 */
	@Override
	public void updateByID(Integer id,User user) {
		// TODO Auto-generated method stub
		List<Category> listcate = categorydao.getAll();
		for (Category categorys : listcate) {
			if (categorys.getCategoryname().equals(user.getCategory().getCategoryname())) {
				 category = categorys;
			}
		}
		List<Role>  listrole = roledao.getAll();
		for (Role roles : listrole) {
			if (roles.getRolename().equals(user.getRole().getRolename())) {
				 role = roles; 
			}
		}
		List<Organization>  listorg = orgdao.getAll();
		for (Organization orgs : listorg) {
			if (orgs.getOrgname().equals(user.getOrganization().getOrgname())) {
				 org = orgs;
			}
		}
		String hql = "update User as u set u.username = :username, u.realname = :realname,u.idcard=:idcard,"
				+ "u.address=:address,u.email=:email,u.phone=:phone,u.images=:images,u.sex=:sex,u.role=:role,"
				+ "u.category=:category,u.organization=:organization  where id = :id";
		Query query = getSession().createQuery(hql);
		query.setInteger("id", id);
		query.setString("username",user.getUsername() );
		query.setString("realname",user.getRealname() );
		query.setString("idcard",user.getIdcard() );
		query.setString("address",user.getAddress() );
		query.setString("email",user.getEmail() );
		query.setString("phone",user.getPhone() );
		query.setString("images",user.getImages() );
		query.setString("sex",user.getSex() );
		query.setInteger("role",role.getId() );
		query.setInteger("category",category.getId());
		query.setInteger("organization",org.getId() );
		query.executeUpdate();
	}

	/*
	 * 2016年4月5日
	 * 
	 * @see com.hal.bms.commons.dao.CrudDao#insert(java.lang.Object)
	 * @param entity
	 * @return
	 */
	@Override
	public void insert(User entity) {
		// TODO Auto-generated method stub
		getSession().save(entity);
	}

	/* 
	 *2016年4月11日
	 * @see com.hal.bms.commons.dao.CrudDao#getAll()
	 *@return
	 */
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		String hql = "From User";
		Query query = getSession().createQuery(hql);
		List<User> list = query.list();
		return list;
	}
	public  void  updateSelf(User user){
	
	 getSession().update(user);
	 getSession().flush();
	}
	public  void updatepwd(User user){
		String hql = "update User as u set u.password = :pwd where u.id = :id";
		Query query =  exeQuery(hql);
		query.setString("pwd", user.getPassword());
		query.setInteger("id", user.getId());
		query.executeUpdate();
	}
}
