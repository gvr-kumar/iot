package com.iot.utils;

public class Student {
	
	private String stdId;
	private String stdName;
	private String stdAddress;
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddress() {
		return stdAddress;
	}
	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}
	public Student(String stdId, String stdName, String stdAddress) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAddress = stdAddress;
	}
	
	
	/*
	 * @Override
	 * 
	 * public String toString() {
	 * 
	 * return this.stdId + " " + this.stdName + " " + this.stdAddress; }
	 */
	 

}
