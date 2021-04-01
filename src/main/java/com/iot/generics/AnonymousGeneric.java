package com.iot.generics;

import java.lang.reflect.Array;

/**
 * 
 * @author gangineni
 * 
 * Method level anonymous generics
 *
 *
 */
public class AnonymousGeneric {

	public static <E extends Object> void printArrAnonym(E[] arr)
	{
		for(E element: arr)
		  {
			  System.out.println(element);
		  }
	}
	
	public static void printArray(Object[] o)
	{
		/*
		 * if(o instanceof Integer[]) { o =(Integer[])o; } else if(o instanceof
		 * Character[]) { o =(Character[])o; } else if(o instanceof Float[]) { o
		 * =(Float[])o; } else if(o instanceof String[]) { o =(String[])o; }
		 *
		 *
		 * else if(o instanceof ElectricCar[]) { o =(ElectricCar[])o; }
		 */
	  for(int i = 0; i< o.length;i++)
	  {
		  System.out.println(o[i]);
	  }
		  
	}
	
	public static void main(String[] args) {
		Tesla tsla = new Tesla();
		Honda hnda = new Honda();
		NissanLeaf nisnLeaf = new NissanLeaf();
		
		Integer[] intArr = {0,1,2,3,4,5,6,7,8,9};
		
		Character[] chrArr = {'a','b','c','d'};
		
		Float[] floatArr = {3.14f, 4.35f, 8.2f, 9.4f};
		
		String[] strArr = {"Java", "C" , "C++"};
		
		ElectricCar[] objArr = {tsla, hnda, nisnLeaf};
		
		printArrAnonym(intArr);
		printArrAnonym(chrArr);
		printArrAnonym(floatArr);
		printArrAnonym(strArr);
		printArrAnonym(objArr);
	}

}
