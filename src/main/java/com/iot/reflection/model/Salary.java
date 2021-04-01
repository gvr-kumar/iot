package com.iot.reflection.model;

public class Salary {
	
	int empId;
	float empSalary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	public Salary(int empId, float empSalary) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
	}
	
	

}
