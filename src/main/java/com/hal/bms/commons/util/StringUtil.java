/**
 * 
 */
package com.hal.bms.commons.util;

import java.io.UnsupportedEncodingException;

/**
 * @author hal
 *
 */
public class StringUtil {
    
	public static String  toCoding(String str){
	  String string = null;
	 try{
		  string = new String(str.getBytes("ISO-8859-1"),"UTF-8");
	  }catch(UnsupportedEncodingException e){
		 System.out.println("转码失败"+e.getMessage());
	  }
		return  string;
	}
}
