/**
 * 
 */
package com.hal.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hal.bms.commons.controller.BaseController;
import com.hal.bms.commons.util.Page;
import com.hal.bms.commons.util.StringUtil;
import com.hal.bms.entity.Books;
import com.hal.bms.entity.Type;
import com.hal.bms.services.BooksServices;


/**
 * @author hal
 *
 */
@Controller
@RequestMapping(value = "books")
public class BooksController extends BaseController {

	@Autowired
	private BooksServices booksServices;

	public Page page = new Page();

	/**
	 * 查询所有图书 2016年4月6日
	 * 
	 * @param books
	 * @return
	 */
	public List<Books> findAll(Books books) {
		return booksServices.findAll(books);
	}

	/**
	 * 通过id查询图书 2016年4月10日
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "edit")
	public String findById(Integer id, Model model) {
		List<Books> books = booksServices.getId(id);
		model.addAttribute("book", books);
		return "sys/editbook";
	}
	@RequestMapping(value="detail")
   public String  getByid(Integer id,Model model) {
	   List<Books> books = booksServices.getId(id);
	   model.addAttribute("books", books);
	 return "web/bookdetail"; 
}
	/**
	 * 分页查询图书 2016年4月10日
	 * 
	 * @param books
	 * @param currentPage
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "booklist", method = RequestMethod.GET)
	public String findByPage(Books books, Integer currentPage, Model model) {
		find(books, currentPage, model);
		return "sys/booklist";
	}

	@RequestMapping(value = "book")
	public String findbooks(Books books, Integer currentPage, Model model) {
		find(books, currentPage, model);
		return "web/books";
	}

	public void find(Books books, Integer currentPage, Model model) {
		int total = findAll(books).size();
		page.setTotal(total);
		page.setCurrentPage(currentPage);
		List<Books> allbook = booksServices.queryByPage(books, page);
		model.addAttribute("page", page);
		model.addAttribute("book", allbook);
	}
 /**
  * 通过名称模糊查询
  *2016年4月10日
  * @param books
  * @param model
  * @return
  */
	@RequestMapping(value = "findname")
	public String findByname(Books books, Model model) {
	      String name = StringUtil.toCoding(books.getBookname());
		   List<Books> list = booksServices.findByName(name);
		   if (list == null || list.isEmpty()) {
			  msg="抱歉，你查询的图书不存在！其他书籍同样精彩，去看看吧！";
			  System.out.println(msg);
			  errors.add(msg);
			  model.addAttribute("errors", errors);
			  return "web/books";
		   }
			model.addAttribute("book", list);
		return "web/books";
	}
	/**
	 * 通过类型查询
	 *2016年4月10日
	 * @param books
	 * @param model
	 * @return
	 */
	@RequestMapping(value="findtype")
	public String  findByType(Type type,Model model) {
		String typename = StringUtil.toCoding(type.getTypename());	
		 List<Books>   list = booksServices.queryBytype(typename);
		  if (list==null) {
			  msg="抱歉，你查询的图书不存在！其他书籍同样精彩，去看看吧！";
			  model.addAttribute("msg", msg);
			  return "web/books";
		   }
		 model.addAttribute("book", list);
		return "web/books";
	}

	/**
	 * 添加图书 2016年4月10日
	 * 
	 * @param books
	 */
	@RequestMapping(value = "/add")
	public void AddBooks(Books books) {
		booksServices.saveEntity(books);
	}

	/**
	 * 删除图书 2016年4月10日
	 * 
	 * @param id
	 */
	@RequestMapping(value = "del/{id}")
	public String delete(@PathVariable Integer id) {
		booksServices.deleteById(id);
		return "redirect:/books/booklist";
	}

	/**
	 * 更新图书信息 2016年4月10日
	 * 
	 * @param books
	 * @return
	 */
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String updateBooks(Books books) {
		int id = books.getId();
		booksServices.updateById(books.getId(), books);
		return "redirect:/books/booklist";
	}

}
