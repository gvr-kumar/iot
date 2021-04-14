package com.iot.generics;

public class TestClass {
	
	/**
	 * here a is a class level variable. 'a' can be accessed using class name without creating 
	 * an object of "TestClass" because 'a' is a static variable.
	 * 
	 * b is a instance variable and b can be called by creating an instance of "TestClass"
	 * 
	 * sum is a instance method
	 * 
	 * s can be accessed only with in the method and cannot be accessed outside the class
	 * 
	 */

	static int a = 10;
	
	float b = 3.4f;
	
	public void sum()
	{
		float s;
		s = a+b;
	}

}
