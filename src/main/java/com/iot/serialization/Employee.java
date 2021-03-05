package com.iot.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String empId;
	private String empName;
	private float empSalary;
	
	/**
	 * To exclude any instance variable from serialization, we use "transient" keyword on the instance variable 
	 * 
	 * 
	 */
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee(String empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return this.empId + " - " + this.empName + " - " + this.empSalary ;
	}

}
