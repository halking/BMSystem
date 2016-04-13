/**
 * 
 */
package com.hal.bms.commons.controller;

//import java.beans.PropertyEditorSupport;
import java.io.IOException;
//import java.util.Date;
//import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ValidationException;
//import javax.xml.validation.Validator;

import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
//import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author hal
 *
 */
public abstract class BaseController {
	/**
	 * BaseController hal
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 添加Model消息
	 * 
	 * @param message
	 */
	protected void addMessage(Model model, String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages) {
			sb.append(message).append(messages.length > 1 ? "<br/>" : "");
		}
		model.addAttribute("message", sb.toString());
	}

	/**
	 * 添加Flash消息
	 * 
	 * @param message
	 */
	protected void addMessage(RedirectAttributes redirectAttributes,
			String... messages) {
		StringBuilder sb = new StringBuilder();
		for (String message : messages) {
			message = message.replace("{", "");
			message = message.replace("}", "");
			message = message.replace("\"", "");
			message = message.replace("\r", "");
			message = message.replace("\r\n", "");
			message = message.replace("#", "");
			sb.append(message).append(messages.length > 1 ? "<br/>" : "");
		}
		redirectAttributes.addFlashAttribute("message", sb.toString());
	}

	/**
	 * 客户端返回JSON字符串
	 * 
	 * @param response
	 * @param object
	 * @return
	 */
	/*
	 * protected String renderString(HttpServletResponse response, Object
	 * object) { return renderString(response, JsonMapper.toJsonString(object),
	 * "application/json"); }
	 */

	/**
	 * 客户端返回字符串
	 * 
	 * @param response
	 * @param string
	 * @return
	 */
	protected String renderString(HttpServletResponse response, String string,
			String type) {
		try {
			response.reset();
			response.setContentType(type);
			response.setCharacterEncoding("utf-8");
			response.getWriter().print(string);
			return null;
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * 参数绑定异常
	 */
	@ExceptionHandler({ BindException.class,
			ConstraintViolationException.class, ValidationException.class })
	public String bindException() {
		return "error/400";
	}

	/**
	 * 授权登录异常
	 */
	/*
	 * @ExceptionHandler({AuthenticationException.class}) public String
	 * authenticationException() { return "error/403"; }
	 */

	/**
	 * 初始化数据绑定 1. 将所有传递进来的String进行HTML编码，防止XSS攻击 2. 将字段中Date类型转换为String类型
	 */
	/*
	 * @org.springframework.web.bind.annotation.InitBinder protected void
	 * initBinder(WebDataBinder binder) { //
	 * String类型转换，将所有传递进来的String进行HTML编码，防止XSS攻击
	 * binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
	 * 
	 * @Override public void setAsText(String text) { setValue(text == null ?
	 * null : StringEscapeUtils.escapeHtml4(text.trim())); }
	 * 
	 * @Override public String getAsText() { Object value = getValue(); return
	 * value != null ? value.toString() : ""; } }); // Date 类型转换
	 * binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
	 * 
	 * @Override public void setAsText(String text) {
	 * setValue(DateUtils.parseDate(text)); } // @Override // public String
	 * getAsText() { // Object value = getValue(); // return value != null ?
	 * DateUtils.formatDateTime((Date)value) : ""; // } });
	 */
}
