package com.iot.comparison.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iot.oops.Human;

public class ComparatorMain {

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
