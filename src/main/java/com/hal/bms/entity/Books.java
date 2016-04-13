package com.hal.bms.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.hal.bms.commons.entity.DataEntity;

/**
 * Books entity. @author MyEclipse Persistence Tools
 */

public class Books  extends DataEntity<Books>{

	// Fields

	private Integer id;
	private Type type = new Type();
	private String bookname;
	private String description;
	private String isbn;
	private Timestamp creatdate;
	private Double price;
	private Short avilable;
	private String author;
	private Timestamp publishdate;
	private String callnum;
	private String hold;
	private  String img;
	private  int  count; 
	private  int  rest;
	private Set<Historyborrow> historyborrows = new HashSet<Historyborrow>(0);
	private Set<Borrow> borrows = new HashSet<Borrow>(0);

	// Constructors

	/** default constructor */
	public Books() {
	}

	/** minimal constructor */
	public Books(String bookname, Double price, String author) {
		this.bookname = bookname;
		this.price = price;
		this.author = author;
	}

	/** full constructor */
	public Books(Type type, String bookname, String description, String isbn,
			Timestamp creatdate, Double price, Short avilable, String author,
			Timestamp publishdate, Set<Historyborrow> historyborrows, Set<Borrow> borrows) {
		this.type = type;
		this.bookname = bookname;
		this.description = description;
		this.isbn = isbn;
		this.creatdate = creatdate;
		this.price = price;
		this.avilable = avilable;
		this.author = author;
		this.publishdate = publishdate;
		this.historyborrows = historyborrows;
		this.borrows = borrows;
	}

	// Property accessors
   
	
	public Integer getId() {
		return this.id;
	}

	/**
	 * @return the callnum
	 */
	public String getCallnum() {
		return callnum;
	}

	/**
	 * @param callnum the callnum to set
	 */
	public void setCallnum(String callnum) {
		this.callnum = callnum;
	}

	/**
	 * @return the hold
	 */
	public String getHold() {
		return hold;
	}

	/**
	 * @param hold the hold to set
	 */
	public void setHold(String hold) {
		this.hold = hold;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getBookname() {
		return this.bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Timestamp getCreatdate() {
		return this.creatdate;
	}

	public void setCreatdate(Timestamp creatdate) {
		this.creatdate = creatdate;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Short getAvilable() {
		return this.avilable;
	}

	public void setAvilable(Short avilable) {
		this.avilable = avilable;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Timestamp getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(Timestamp publishdate) {
		this.publishdate = publishdate;
	}

	public Set<Historyborrow> getHistoryborrows() {
		return this.historyborrows;
	}

	public void setHistoryborrows(Set<Historyborrow> historyborrows) {
		this.historyborrows = historyborrows;
	}

	public Set<Borrow> getBorrows() {
		return this.borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}

	/**
	 * @return the img
	 */
	public String getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(String img) {
		this.img = img;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
 
	/**
	 * @return the rest
	 */
	public int getRest() {
		return rest;
	}

	/**
	 * @param rest the rest to set
	 */
	public void setRest(int rest) {
		this.rest = rest;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

}