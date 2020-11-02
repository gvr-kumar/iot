package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class ElementsOrder {

	public static void main(String[] args) {
		
		/*
		 * parent class reference can be assigned to child class object
		 * if we dont specify generics then any datatype can be inserted into the collections ().
		 */
		
		ArraysHw arrHw = new ArraysHw();
		
		//List without generics
		
		List arrList = new ArrayList(); 
		
		arrList.add(100);
		arrList.add("Java");
		arrList.add(true);
		arrList.add(1.234f);
		arrList.add(arrHw);

		
	}
}
