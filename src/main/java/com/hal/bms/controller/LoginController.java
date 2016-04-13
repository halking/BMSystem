/**
 * 
 */
package com.hal.bms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.entity.User;
import com.hal.bms.services.UserServices;
  
/**
 * @author hal
 *
 */
@Controller
public class LoginController extends BaseController {
 @Autowired
	 UserServices userServices;
 /**
  * 登录
  *2016年4月11日
  * @param users
  * @param model
  * @param session
  * @return
  */
 @RequestMapping(value="login",method=RequestMethod.POST)
 public   String  login(User users,Model model,HttpSession session) {
	  List<User>  list =  userServices.getAll();
		String code = users.getCode();
		for(User users2 : list){
		if( users2.getUsername().equals( users.getUsername() )  && users2.getPassword().equals(users.getPassword())
				&& code.equalsIgnoreCase(session.getAttribute("code").toString())  )  {
			session.setAttribute("user", users2);
			if("admin"==users.getUsername()){
				return "redirect:/all/system";
			}
			return  "redirect:/all/index";
		} else {
			return "a/login";
		}
		}
		return  "a/login";
}
/**
 * 注销登录
 */
	@RequestMapping(value="exit",method=RequestMethod.GET)
	public String exit(HttpSession session,HttpServletRequest request){
		String  username = (String) session.getAttribute("username");
		if (username!=null || username!="") {
		  request.getSession(false).invalidate();
		}
		return  "redirect:/all/index";
	}
}
