package com.hal.bms.entity;

import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role extends DataEntity<Role>{

	// Fields


	private Integer id;
	private  Set<Resources> resources = new HashSet<Resources>();
	private String description;
	private Short available;
	private String rolename;
	private Set<User> users = new HashSet<User>(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** minimal constructor */
	public Role(Short available, String role) {
		this.available = available;
		this.rolename = role;
	}

	/** full constructor */
	public Role(Set<Resources> resources, String description, Short available,
			String role, Set<User> users) {
		this.resources =  resources;
		this.description = description;
		this.available = available;
		this.rolename = role;
		this.users = users;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the resources
	 */
	public Set<Resources> getResources() {
		return resources;
	}

	/**
	 * @param resources the resources to set
	 */
	public void setResources(Set<Resources> resources) {
		this.resources = resources;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getAvailable() {
		return this.available;
	}

	public void setAvailable(Short available) {
		this.available = available;
	}

	/**
	 * @return the rolename
	 */
	public String getRolename() {
		return rolename;
	}

	/**
	 * @param rolename the rolename to set
	 */
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}