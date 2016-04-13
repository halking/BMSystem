/**
 * 
 */
package com.hal.bms.commons.util;

import com.hal.bms.commons.entity.DataEntity;

/**
 * @author hal
 *
 */
public  class Page  extends  DataEntity<Page>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  int  total = 0;
    private  int  pageNum;
    private  int  perPagenum = 14;
    private  Integer  currentPage = 1;
//    private  int  start;
    public Page() {
		// TODO Auto-generated constructor stub
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
		//this.pageNum = total % perPagenum == 0 ? total/perPagenum : total/perPagenum +1;
	}
	public int getPageNum() {
		return   this.pageNum = total % perPagenum == 0 ? total/perPagenum : total/perPagenum +1;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPerPagenum() {
		return perPagenum;
	}
	public void setPerPagenum(int perPagenum){
		this.perPagenum = perPagenum;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public int getStart() {
	    	return    ((currentPage-1)*perPagenum);
	    
	}
   public int countPage(){
   	this.pageNum = getTotal() % getPerPagenum() == 0 ? getTotal()/getPerPagenum() :
   		getTotal() / getPerPagenum() + 1;
   	return pageNum;
   }
}

