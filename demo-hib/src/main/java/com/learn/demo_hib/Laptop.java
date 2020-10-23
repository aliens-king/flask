package com.learn.demo_hib;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Laptop {
	@Id
	private int lid;
	private String lname;

	

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
