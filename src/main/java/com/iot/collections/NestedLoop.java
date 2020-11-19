package com.iot.collections;

import java.util.HashMap;
import java.util.Map;

public class NestedLoop {
	
	/*Nested loops: should be very careful when using nested loops coz they cause performance issues.
	 * 
	 * if a for loop contains a method call which in turn has a for loop is also nested loop.
	 */

	public static void main(String[] args) {
		
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		
		intMap.put(1, 1);
		intMap.put(2, 2);
		intMap.put(3, 3);
		intMap.put(4, 4);
		intMap.put(5, 5);
		
		for(int i =1;i<= 5;i++)
		{
				System.out.println("j: "+ intMap.get(i));
		}

	}

}
