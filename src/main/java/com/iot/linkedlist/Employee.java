package com.iot.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	String dept;

	public static List<Employee> empList = new ArrayList<Employee>();

	public static void setEmpList(List<Employee> emplList) {
		empList = emplList;
	}

	public static List<Employee> getEmpList() {
		Collections.sort(empList);
		return empList;
	}

	/*
	 * public Employee() { }
	 */

	public Employee(int empId, String empName, String dept) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public static Employee empDetails(int emplId) {
		Employee empObj = null;

		/*
		 * Iterator<Employee> empItr = empList.iterator();
		 * 
		 * while(empItr.hasNext()) { if(emplId == empItr.next().getEmpId()) { empObj =
		 * empItr.next(); break; } }
		 */

		for (int i = 0; i < empList.size(); i++) {
			if (emplId == empList.get(i).getEmpId()) {
				empObj = empList.get(i);
			}
		}

		return empObj;
	}

	public int compareTo(Employee emp) {

		if (this.getEmpId() > emp.getEmpId()) {
			return 1;
		} else if (this.getEmpId() < emp.getEmpId()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {

		return this.empId + ", " + this.empName + ", " + this.dept;
	}

}
