package com.iot.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LlHumanNode {
	
	/**
	 * POJO for Double Linked List
	 * 
	 */
	
	private String fname;
	private String lname;
	private String address;
	private LlHumanNode fwdRef;
	private LlHumanNode bwdRef;
	
	public LlHumanNode(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}
	public LlHumanNode getFwdRef() {
		return fwdRef;
	}
	public void setFwdRef(LlHumanNode fwdRef) {
		this.fwdRef = fwdRef;
	}
	
	public LlHumanNode getBwdRef() {
		return bwdRef;
	}
	public void setBwdRef(LlHumanNode bwdRef) {
		this.bwdRef = bwdRef;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
