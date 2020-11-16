package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListModifications {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 */

		List<Integer> intArr1 = new ArrayList<Integer>();
		List<Integer> intArr2 = new ArrayList<Integer>();
		List<Integer> intArr3 = new ArrayList<Integer>();
		
		intArr1.add(10);
		intArr1.add(20);
		intArr1.add(30);
		intArr1.add(40);
		intArr1.add(50);
		intArr1.add(60);
		intArr1.add(70);
		intArr1.add(80);
		intArr1.add(90);
		intArr1.add(100);
		
		for(int i=0;i<intArr1.size();i++)
		{
			if(intArr1.get(i)==70)
			{
				intArr1.remove(i);
			}
		}
		
		System.out.println(intArr1);
		
		intArr2.add(110);
		intArr2.add(120);
		intArr2.add(130);
		intArr2.add(140);
		intArr2.add(150);
		
		System.out.println("before add all: " + intArr1);
		
		intArr1.addAll(intArr2);
		
		System.out.println("after add all: " + intArr1);
		
		intArr3.add(55);
		intArr3.add(65);
		intArr3.add(75);
		
		intArr1.addAll(4, intArr3); //will add from that index
		
		
		System.out.println("after add all at particular index: " + intArr1);
		
	}

}
