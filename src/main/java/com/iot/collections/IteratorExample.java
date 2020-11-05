package com.iot.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 */
		
		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(10);
		intArr.add(20);
		intArr.add(30);
		intArr.add(40);
		intArr.add(50);
		
		ListIterator<Integer> itr = intArr.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

	}

}
