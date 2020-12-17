package com.iot.phoenix.training;

import java.util.ArrayList;
import java.util.List;


public class EmpWFMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//EmployeeWF empwf = new EmployeeWF("a1","b1","level1","eng1");
		//EmployeeWF empwf1 = new EmployeeWF("a2","b2","level2","eng2");
		//EmployeeWF empwf2 = new EmployeeWF("a3","b3","level3","eng3");
		//EmployeeWF empwf3 = new EmployeeWF("a4","b4","level4","eng4");
		
		//List<String> intArr1 = new ArrayList<String>();
		
		//intArr1.addAll((Collection<? extends String>) empwf);
		
      List<String> empList = new ArrayList<String>();
		
      empList.add("A1");
      empList.add("A2");	
      empList.add("A3");
      empList.add("A4");
      
      System.out.println(empList.size());
				
	  for (int i = 0; i<empList.size(); i++) {
		  System.out.println(empList.get(i));
	  }

	}

}
