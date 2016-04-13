package com.hal.bms.entity;

import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Organization entity. @author MyEclipse Persistence Tools
 */

public class Organization extends DataEntity<Organization> {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String orgname;
	private String parentId;
	private String parentIds;
	private Short available;
	private Set<User> users = new HashSet<User>();

	// Constructors

	/** default constructor */
	public Organization() {
	}

	/** minimal constructor */
	public Organization(String orgname, Short available) {
		this.orgname = orgname;
		this.available = available;
	}

	/** full constructor */
	public Organization(String orgname, String parentId, String parentIds,
			Short available, Set<User> users) {
		this.orgname = orgname;
		this.parentId = parentId;
		this.parentIds = parentIds;
		this.available = available;
		this.users = users;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrgname() {
		return this.orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
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

	public Short getAvailable() {
		return this.available;
	}

	public void setAvailable(Short available) {
		this.available = available;
	}

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}