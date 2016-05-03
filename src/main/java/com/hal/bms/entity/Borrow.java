package com.hal.bms.entity;

import java.util.Date;
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
	private Date borrowdate;
	private Date returndate;
	private Date mustdate;
	private Double payfine;
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
	public Borrow(User user, Books books, String remark, Date borrowdate,
			Date returndate, Date mustdate, Double payfine) {
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

	public Date getBorrowdate() {
		return this.borrowdate;
	}

	public void setBorrowdate(Date  borrowdate) {
		this.borrowdate = borrowdate;
	}

	public Date  getReturndate() {
		return this.returndate;
	}

	public void setReturndate(Date  returndate) {
		this.returndate = returndate;
	}

	public Date  getMustdate() {
		return this.mustdate;
	}

	public void setMustdate(Date mustdate) {
		this.mustdate = mustdate;
	}

	public Double getPayfine() {
		return this.payfine;
	}

	public void setPayfine(Double payfine) {
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