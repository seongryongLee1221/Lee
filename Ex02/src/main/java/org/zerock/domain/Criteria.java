package org.zerock.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Criteria {

	  private int pageNum;
	  private int amount;
	  
//	  private String type;
//	  private String keyword;

	  public Criteria() {
	    this(1, 10);
	  }
	  
	  public Criteria(int pageNum, int amount) {
		  this.pageNum = pageNum;
		  this.amount = amount;
	  }

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	  
//	  public String[] getTypeArr() {
//	    
//	    return type == null? new String[] {}: type.split("");
//	  }
	}