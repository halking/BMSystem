package com.hal.bms.entity;

import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type extends DataEntity<Type> {

	// Fields

	/**
	 * 
	 */
	private Integer id;
	private String typename;
	private String description;
	private Set<Books> bookses = new HashSet<Books>(0);

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** full constructor */
	public Type(String typename, String description, Set<Books> bookses) {
		this.typename = typename;
		this.description = description;
		this.bookses = bookses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Books> getBookses() {
		return this.bookses;
	}

	public void setBookses(Set<Books> bookses) {
		this.bookses = bookses;
	}

}