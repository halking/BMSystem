/**
 * 
 */
package com.hal.bms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hal.bms.commons.services.CrudServices;
import com.hal.bms.commons.util.Page;
import com.hal.bms.dao.UserDao;
import com.hal.bms.entity.User;

/**
 * @author hal
 * @param <T>
 *
 */
@Service
public class UserServices  extends CrudServices<UserDao, User> {

	/* 
	 *2016年4月6日
	 * @see com.hal.bms.commons.services.BaseServices#queryByPage(java.lang.Object, java.lang.Object)
	 *@param entity
	 *@param page
	 *@return
	 */
	@Override
	public List<User> queryByPage(User entity, Page page) {
		// TODO Auto-generated method stub
		return null;
	}      
    public  void updateSelf(User user){
    	dao.updateSelf(user);
    }
    public  void updatepwd(User user){
    	dao.updatepwd(user);
    }
}
