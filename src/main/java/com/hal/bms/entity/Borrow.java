package com.hal.bms.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Borrow entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Borrow extends DataEntity<Borrow>{

	// Fields

	private Integer id;
	private User user;
	private Books books;
	private String remark;
	private Timestamp borrowdate;
	private Timestamp returndate;
	private Timestamp mustdate;
	private Short payfine;
	private  Set<Historyborrow>  historyborrows = new HashSet<Historyborrow>();

	// Constructors

	/** default constructor */
	public Borrow() {
	}


	/**
	 * @param user
	 * @param books
	 * @param remark
	 * @param borrowdate
	 * @param returndate
	 * @param mustdate
	 * @param payfine
	 */
	public Borrow(User user, Books books, String remark, Timestamp borrowdate,
			Timestamp returndate, Timestamp mustdate, Short payfine) {
		this.user = user;
		this.books = books;
		this.remark = remark;
		this.borrowdate = borrowdate;
		this.returndate = returndate;
		this.mustdate = mustdate;
		this.payfine = payfine;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getBorrowdate() {
		return this.borrowdate;
	}

	public void setBorrowdate(Timestamp borrowdate) {
		this.borrowdate = borrowdate;
	}

	public Timestamp getReturndate() {
		return this.returndate;
	}

	public void setReturndate(Timestamp returndate) {
		this.returndate = returndate;
	}

	public Timestamp getMustdate() {
		return this.mustdate;
	}

	public void setMustdate(Timestamp mustdate) {
		this.mustdate = mustdate;
	}

	public Short getPayfine() {
		return this.payfine;
	}

	public void setPayfine(Short payfine) {
		this.payfine = payfine;
	}


	/**
	 * @return the historyborrows
	 */
	public Set<Historyborrow> getHistoryborrows() {
		return historyborrows;
	}


	/**
	 * @param historyborrows the historyborrows to set
	 */
	public void setHistoryborrows(Set<Historyborrow> historyborrows) {
		this.historyborrows = historyborrows;
	}
  
}