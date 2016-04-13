package com.hal.bms.entity;

import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Category extends DataEntity<Category>{

	// Fields

	private Integer id;
	private String categoryname;
	private Integer amount;
	private Integer timelimit;
	private String fine;
	private Set<User> users = new HashSet<User>(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String categoryname, Integer amount, Integer timelimit) {
		this.categoryname = categoryname;
		this.amount = amount;
		this.timelimit = timelimit;
	}

	/** full constructor */
	public Category(String categoryname, Integer amount, Integer timelimit,
			String fine, Set<User> users) {
		this.categoryname = categoryname;
		this.amount = amount;
		this.timelimit = timelimit;
		this.fine = fine;
		this.users = users;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getTimelimit() {
		return this.timelimit;
	}

	public void setTimelimit(Integer timelimit) {
		this.timelimit = timelimit;
	}

	public String getFine() {
		return this.fine;
	}

	public void setFine(String fine) {
		this.fine = fine;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}