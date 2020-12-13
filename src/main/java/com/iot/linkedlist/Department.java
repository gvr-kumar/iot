package com.iot.linkedlist;

import java.util.List;

public class Department {
	int empId;
	String deptId;
	
	List<Employee> empsList = null;
	
	
	
	public Department(int empId, String deptId) {
		super();
		this.empId = empId;
		this.deptId = deptId;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	//for a given department, find number of employees with their names
	
	//for a given employee, find its details and department details
	
	//onboarding employees, setup departments
	

}
