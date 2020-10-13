package com.iot.wrapperclassautoboxingunboxing;



public class AutoBoxingUnBoxing {
	
	/*
	 * Wrapper classes: 
	 * Integer, Char, Float, Double, big decimal and big integer have wrapper classes
	 * 
	 * In real time for integer variables, we use Wrapper classes like Integer.
	 * 
	 * Autoboxing: Wrapper class references can be assigned with primitive values
	 * 
	 * Can't autobox different types when declaring variables.
	 * 
	 * Auto unboxing: primitive types references can  be assigned with the wrapper class instances.
	 * 
	 * 
	 * When used: 
	 * 
	 * 
	 */
	
	public static void main(String[] args) 
	{
		
		Integer a = new Integer(10);
		
		Integer b = new Integer("20");
		
		Integer c = Integer.sum(a,b);
		
		Boolean b1 = new Boolean("true");
		
		//System.out.println("a : " + a);
	
	
		int d = 30;
		int e = 40;
		int f = d + e;
		
		//Autoboxing examples
		
		Integer a1 = 10;
		
		System.out.println("autoboxing a1 : " + a1);
		
		Double d1 = 2.5678;
		
		Float f1 = 3f;
		
		Character c1 = 'A';
		
		Boolean b2 = false;
		
		//Auto unboxing
		
		int z = new Integer(50); // 50 is unboxed from Integer type to int
		
		System.out.println("auto unboxing z: " + z);
		
		float x = new Float(2.45); // 2.45 is unboxed from Float type to float
		
		double y = new Double(3.5678); // 50 is unboxed from Double type to double
		
		char w = new Character('A'); // 50 is unboxed from Character type to char
	
		boolean b3 = new Boolean(true);
	
	}
	
	public Integer getSum(Integer a, int b)
	{
		return a + b/ 10;
	}
	
	
}
