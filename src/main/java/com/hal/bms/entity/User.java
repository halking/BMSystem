package com.hal.bms.entity;

import java.beans.Transient;
import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * user-> type  =  
 * User entity. @author MyEclipse Persistence Tools
 */
   
@SuppressWarnings("serial")
public class User extends DataEntity<User>{

	// Fields

	private Integer id;
	private Role role;
	private Category category;   //
	private Organization organization;
	private String username;
	private String password;
	private String realname;
	private String idcard;
	private String address;
	private String email;
	private String phone;
	private String images;
	private String sex;
	private Set<Borrow> borrows = new HashSet<Borrow>(0);
	private Set<Historyborrow> historyborrows = new HashSet<Historyborrow>(0);
  
	private String  code ;
	// Constructors

	/**
	 * @return the code
	 */
	@Transient
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String username, String password, String realname,
			String idcard, String phone) {
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.idcard = idcard;
		this.phone = phone;
	}

	/** full constructor */
	public User(Role role, Category category, String username, String password,
			String realname, String idcard, String address, String email,
			String phone, String images, String sex, Set<Borrow> borrows,
			Set<Historyborrow> historyborrows) {
		this.role = role;
		this.category = category;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.idcard = idcard;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.images = images;
		this.sex = sex;
		this.borrows = borrows;
		this.historyborrows = historyborrows;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
  
	/**
	 * @return the organization
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Set<Borrow> getBorrows() {
		return this.borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}

	public Set<Historyborrow> getHistoryborrows() {
		return this.historyborrows;
	}

	public void setHistoryborrows(Set<Historyborrow> historyborrows) {
		this.historyborrows = historyborrows;
	}

}