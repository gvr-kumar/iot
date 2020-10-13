package com.iot.onlyoneobject;

  public class OnlyOneObjectClass {
	
		
	 private OnlyOneObjectClass() 
	 {
		  
	 }

	  public static void method1() 
	  { 
		  final  OnlyOneObjectClass obj1  = new OnlyOneObjectClass(); 
		  System.out.println(obj1);
	  }
	 	 
	 
}


/*
 * private, 
 * protected
 * 
 * Final static
 * 
 * constructors
 * 
 */

