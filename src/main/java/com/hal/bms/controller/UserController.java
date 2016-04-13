/**
 * 
 */
package com.hal.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.entity.User;
import com.hal.bms.services.UserServices;

/**
 * @author hal
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController extends BaseController {
  
	 @Autowired
	 private  UserServices userServices;
	 

		/**
		 * 通过id查询图书 2016年4月10日
		 * 
		 * @param id
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "edit")
		public String findById(Integer id, Model model) {
			List<User> users = userServices.getId(id);
			model.addAttribute("users", users);
			return "sys/edituser";
		}
		
	 /**
	  * 查询用户
	  *2016年4月11日
	  * @param user
	  * @param model
	  * @return
	  */
	 @RequestMapping(value="userlist")
	 public  String findlist(User user,Model model){
		  List<User>  Alluser  =    userServices.findAll(user);
		  model.addAttribute("alluser",Alluser);
		 return  "sys/userlist" ;
	 }
	 /**
	  * 添加用户
	  *2016年4月11日
	  * @param user
	  * @return
	  */
	 @RequestMapping(value="creat")
	 public  String  creatUser(User user){
		 userServices.saveEntity(user);		 
		 return "";
	 }
	 /**
	  * 更新用户
	  *2016年4月11日
	  * @param user
	  * @return
	  */
	 @RequestMapping(value="update")
	 public String   update(User user) {
		userServices.updateById(user.getId(),user);
		 return  "redirect:/user/userlist";
	}
	 /**
	  * 删除用户
	  *2016年4月11日
	  * @param user
	  * @return
	  */
	 @RequestMapping(value="del")
	public String  delete(User user) {
		userServices.deleteById(user.getId());
		return  "redirect:/user/userlist";
	} 
}
