package com.hal.bms.entity;

import com.hal.bms.commons.entity.DataEntity;


/**
 * Resources entity. @author MyEclipse Persistence Tools
 */

public class Resources extends DataEntity<Resources> {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String rename;
	private String type;
	private String url;
	private String parentId;
	private String parentIds;
	private String permssion;
	private Short available;
	private Role roles ;

	// Constructors

	/** default constructor */
	public Resources() {
	}

	/** minimal constructor */
	public Resources(String rename, Short available) {
		this.rename = rename;
		this.available = available;
	}

	/** full constructor */
	public Resources(String rename, String type, String url, String parentId,
			String parentIds, String permssion, Short available, Role roles) {
		this.rename = rename;
		this.type = type;
		this.url = url;
		this.parentId = parentId;
		this.parentIds = parentIds;
		this.permssion = permssion;
		this.available = available;
		this.roles = roles;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRename() {
		return this.rename;
	}

	public void setRename(String rename) {
		this.rename = rename;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return this.parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getPermssion() {
		return this.permssion;
	}

	public void setPermssion(String permssion) {
		this.permssion = permssion;
	}

	public Short getAvailable() {
		return this.available;
	}

	public void setAvailable(Short available) {
		this.available = available;
	}

	/**
	 * @return the roles
	 */
	public Role getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Role roles) {
		this.roles = roles;
	}

}