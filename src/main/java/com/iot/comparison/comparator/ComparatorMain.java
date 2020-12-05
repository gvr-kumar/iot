package com.iot.comparison.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iot.oops.Human;

public class ComparatorMain {
	
	/***
	 * 
	 * Comparable: if we want to sort objects based on a single parameter (instance variable) then we go for comparable interface implementation 
	 * by overriding compareTo method.
	 * 
	 * Comparator: if we want to sort objects based on more than one parameter (instance variables) then we go for comparator interface implementation 
	 * 
	 * by overriding compare method.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Human kishore = new Human("Madina", "Kishore", 25, "India");
		
		Human vasantha = new Human("Kavuri", "Vasantha", 20, "USA");
		
		List<Human> humanList = new ArrayList<Human>();
		
		Collections.addAll(humanList, kishore, vasantha);
		
		NameComparator namComp = new NameComparator();
		
		AgeComparator agComp = new AgeComparator();
		
		Collections.sort(humanList, namComp);
		
		System.out.println(humanList);
		
		Collections.sort(humanList, agComp);
		
		System.out.println(humanList);

	}

}
