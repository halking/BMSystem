/**
 * 
 */
package com.hal.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.commons.util.Page;

/**
 * @author hal
 *
 */
@Controller
@RequestMapping(value="all")
public class IndexController extends BaseController {
     
	@RequestMapping(value="index",method=RequestMethod.GET)
	  public  String  index() {
		return  "web/index";
	}
	@RequestMapping(value="system",method=RequestMethod.GET)
	  public  String  system() {
		return  "sys/system";
	}
	@RequestMapping(value="page")
	public String  page(Model model) {
		BooksController booksController = new BooksController();
		Page page = booksController.page;
		model.addAttribute("page", page);
		return "include/page";
		
	}
}
