package com.iot.generics;

import com.iot.reflection.model.Employee;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.iot.reflection.model.Department;

public class GenericsMain {

	public static void main(String[] args) {
		
		float height = 6.1f;
		int age = 0;
		String address = "Vivekananda Nagar";
		
		Employee vivek = new Employee(01, "Vivek");
		Department acc = new Department(1000, "Accounting");
		
		Set testSet = new HashSet();
		
		Collections.addAll(testSet, age, height, address, vivek, acc);

		//System.out.println(vivekSet.size());
		
		Iterator<Object> itr = testSet.iterator();
		
		while(itr.hasNext())
		{
			Object o = itr.next();
			
				if(o instanceof Employee)
				{
					Employee emp = (Employee)o;
					if(emp.getEmpName().equalsIgnoreCase("vivek"))
					{
						System.out.println(emp.getEmpName());
					}
				}
				if(o instanceof Float)
				{
					float f = (Float) o;
					if(f > 6.0)
					{
						System.out.println(f);
					}
				}
				
			
			//System.out.println(o);
		}
	}

}
