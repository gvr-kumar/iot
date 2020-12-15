package com.iot.phoenix.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iot.comparison.GiftBasket;

public class EmployeeWF {
	
	String lastName;
	String firstName;
	String department;
	String Job;
	
	List<String> empList = new ArrayList<String>();
	
	public EmployeeWF(String lastName, String firstName, String department, String job) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.department = department;
		Job = job;
	}
	
	public List<String> getempList() {
		 Collections.sort(empList);
		 return empList;
	}
	
	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	

public int compareTo(EmployeeWF o) {
		
		return this.firstName.compareTo(o.firstName); //here 	qualifying parameter is basketName
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.firstName + " : " + this.getempList();
}
	

}
