package com.iot.reflection;

public class Department {
	
	private String deptID;
	private String deptName;
		
	public Department(String deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}
	
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
