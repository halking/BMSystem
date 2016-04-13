package com.hal.bms.entity;

import java.sql.Timestamp;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Historyborrow entity. @author MyEclipse Persistence Tools
 */

public class Historyborrow extends DataEntity<Historyborrow> {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Borrow borrow;
	private String remark;


	// Constructors

	/** default constructor */
	public Historyborrow() {
	}

	/** full constructor */
	public Historyborrow( Borrow borrow, String remark) {
		
		this.remark = remark;
		this.borrow = borrow;
	}
    
	// Property accessors

	/**
	 * @return the borrow
	 */
	public Borrow getBorrow() {
		return borrow;
	}

	/**
	 * @param borrow the borrow to set
	 */
	public void setBorrow(Borrow borrow) {
		this.borrow = borrow;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}