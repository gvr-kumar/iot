package com.iot.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeptEmpMainClass {

	public static void main(String[] args) {

		Employee virat = new Employee(4, "Virat Kohli", "Sales");
		Employee kishore = new Employee(1, "Kishore Maidna", "IT Consulting");
		Employee vasantha = new Employee(3, "Vasantha Kavuri", "Human Resources");
		Employee ravi = new Employee(2, "Ravi Kumar", "Sales");

		List<Employee> empList = new ArrayList<Employee>();
		Collections.addAll(empList, kishore, ravi, vasantha, virat);

		Employee.setEmpList(empList);
		empList = Employee.getEmpList();
		System.out.println(empList);

		//Employee emp = new Employee();
		System.out.println(Employee.empDetails(2));

	}

}
