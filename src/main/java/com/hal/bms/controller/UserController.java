
package com.hal.bms.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.entity.User;
import com.hal.bms.services.UserServices;
import com.hal.bms.utils.UserUtils;

/**
 * @author hal
 *
 */
@Controller
@RequestMapping(value="user")
public class UserController extends BaseController {
  
	 @Autowired
	 private  UserServices userServices;
	 Set<User>  users = new HashSet<User>();

		/**
		 * 通过id查询读者 2016年4月10日
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
		}	/**
		 * 通过id查询读者 2016年4月10日
		 * 
		 * @param id
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "get",method=RequestMethod.GET)
		public String getById(HttpSession session,Model model) {
			User currentUser =  (User)session.getAttribute("user");
			User  user = userServices.get(currentUser.getId());
			users.add(user);
			model.addAttribute("users", users);
			return "web/userdetail";
		}
		@RequestMapping(value="currenedit")
       public  String editById(HttpServletRequest request,Model model){
			User user = UserUtils.getCurrUser(request);
			users.add(user);
			model.addAttribute("users", users);
			return  "web/edituser";
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
	 public  String  creatUser(User user,Model model){
		 userServices.saveEntity(user);
		 model.addAttribute(user);
		 return  "web/success";
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
	  * 更新用户
	  *2016年4月11日
	  * @param user
	  * @return
	  */
	 @RequestMapping(value="updateself")
	 public String   updateself(User user,RedirectAttributes redirectAttributes,HttpServletRequest request) {
		userServices.updateSelf(user);
		addMessage(redirectAttributes, "修改成功");
		 return  "redirect:/user/get";
	}
	 @RequestMapping(value="updatepwd")
	 public String   updateself(User user,RedirectAttributes redirectAttributes) {
		userServices.updatepwd(user);
		addMessage(redirectAttributes, "修改成功");
		 return  "redirect:/user/get";
	}
	 /**
	  * 删除用户
	  *2016年4月11日
	  * @param user
	  * @return
	  */
	 @RequestMapping(value="del/{id}")
	public String  delete(@PathVariable Integer id) {
		userServices.deleteById(id);
		return  "redirect:/user/userlist";
	} 
	 @RequestMapping(value="pwd",method=RequestMethod.GET)
	 public  String  changep(){
		 return "web/changepwd";
	 }
	 @RequestMapping(value="self")
	 public String selfuser(){
		 return "web/selfuser";
	 }
}
