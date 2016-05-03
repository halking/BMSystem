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
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.entity.User;
import com.hal.bms.services.UserServices;
import com.hal.bms.validate.LoginValidator;
  
/**
 * @author hal
 *
 */
@Controller
@RequestMapping(value="user")
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
 public   String  login(@ModelAttribute User users,Model model,HttpSession session,BindingResult bindingResult) {
//	 System.out.println("000000000000000");
	 LoginValidator  loginValidator =  new LoginValidator();
	 loginValidator.validate(users, bindingResult);
	 if (bindingResult.hasErrors()) {
		FieldError  fieldError = bindingResult.getFieldError();
		logger.info("Code: "+fieldError.getCode()+"，field: "+fieldError.getField());
		return  "web/login";
	}
	  List<User>  list =  userServices.getAll();
		String code = users.getCode();
//		System.out.println(code);
		for(User users2 : list){
		if( users2.getUsername().equals( users.getUsername() )  && users2.getPassword().equals(users.getPassword())
				&& code.equalsIgnoreCase(session.getAttribute("code").toString())  )  {
			session.setAttribute("user", users2);
			if("admin"==users.getUsername()){
				return "sys/system";
			}
			return  "web/index";
		} 
		}
		return  "web/login";
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
