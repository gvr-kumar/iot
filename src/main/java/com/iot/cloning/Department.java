package com.iot.cloning;

public class Department implements Cloneable {
	
	private String deptId;
	private String deptName;
	private Address deptAddress;  //Address is associated reference
	
	@Override
	protected Department clone() throws CloneNotSupportedException {
		Department dept = (Department)super.clone();
		Address addr = deptAddress.clone();
		dept.setDeptAddress(addr);
		return dept;
	}
	
	public Department(String deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public Address getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(Address deptAddress) {
		this.deptAddress = deptAddress;
	}
	
	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return this.deptId + " - " + this.deptName + " - " + this.deptAddress;
	}
	
	

}
