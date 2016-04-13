/**
 * 
 */
package com.hal.bms.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hal.bms.entity.User;


/**
 * @author hal
 *
 */
public class UserUtils {
   
	 public  static HttpSession  getSession(HttpServletRequest request) {
		     return  request.getSession();
	}
	 
	 public static User getCurrUser(HttpServletRequest request) {
		   HttpSession  session = request.getSession();
		  if (session!=null) {
			 return  (User) session.getAttribute("user");
		}else {
			return null;
		}
	}
}
