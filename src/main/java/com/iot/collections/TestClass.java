package com.iot.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.iot.oops.Human;

public class TestClass {

	public static void main(String[] args) {
		
		Human kishore = new Human("Madina", "Kishore", 25, "India");
		
		Human vasantha = new Human("Kavuri", "Vasantha", 25, "USA");
		
		Human ravi = new Human("Kumar", "Ravi", 25, "India");
		
		List<Human> humanList = new ArrayList<Human>();
		
		Collections.addAll(humanList, kishore, vasantha, ravi);
		
		
		for(int i = 0; i<humanList.size();i++)
		{
			if(humanList.get(i).getFirstName().equalsIgnoreCase("kishore"))
			{
				System.out.println(humanList.get(i).getLastName());
			}
			
		}
		
		//{10, 80, 50, 55, 75, 35, 11, 8, 19};
		
		List<Integer> intList = new ArrayList<Integer>();
		
		Collections.addAll(intList, 10,80, 50, 55, 75, 35, 11, 8, 19);
		
		//OR
		
		Integer[] arrEx = new Integer[] {10,80, 50, 55, 75, 35, 11, 8, 19};
		
		List<Integer> intArrList = Arrays.asList(arrEx);
		
		//to check if an element is present in a list or not
		
//method1:	
		if(intArrList.contains(39))
		{
			System.out.println("True");
		}
	
//method2:
		
		Iterator<Integer> itr = intArrList.iterator();
		
		while(itr.hasNext())
		{	 
			if(itr.next()==39)
			{
				System.out.println("True");
				break;
			}
			
		}
				
				
		
		
	}

}
