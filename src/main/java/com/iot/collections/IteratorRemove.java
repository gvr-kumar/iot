package com.iot.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorRemove {
	
	/*
	 * For value based operations use iterator and
	 * 
	 *  for index based operations use for loop
	 * 
	 */
	
	public static void main(String[] args) 
	{
		int valToDel = 40;
		List<Integer> intArr = new ArrayList<Integer>();
		
		intArr.add(10);
		intArr.add(20);
		intArr.add(30);
		intArr.add(40);
		intArr.add(50);
		
		ListIterator<Integer> itr = intArr.listIterator();
		
		while(itr.hasNext())
		{
			if(itr.next()==valToDel)
			{
				itr.remove();
			}
		}
		System.out.println(intArr);
		
		//H.W: try all methods in arraylist in one example
	}
}
