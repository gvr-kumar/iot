package com.iot.utils;

/*
 * final constants & methods should always be static
 * 
 * static: static variable's value will be same throughout the class and across the objects 
 * 
 * where as non-static variable's value will not be same throughout the class and across the objects
 * 
 * 
 * static variables can be directly accessed using the class name (same applies for methods)
 * 
 * where as non-static variables can be directly accessed using the class name
 * 
 * methods can also be declared as static
 * 
 * 
 */

public class StaticUtils {
	
	static int static_var = 10;
	int nonStatic_var = 20;

	Integer intgr = 10;
	
	int constInt1 = 50;
	
	static int constInt2 = 25;
	
	
	public int getConstInt1() {
		constInt1 = constInt1 * 20;
		return constInt1;
	}

	public int getConstInt2() {
		constInt2 = constInt2 * 10;
		return constInt2;
	}
	
	static int staticMethod()
	{
		return (2 * static_var);
	}
	
	int nonStaticMethod()
	{
		return (2 * nonStatic_var);
	}
	
	int nonStaticMethod_UsingStaticVar()
	{
		return (2 * static_var);
	}
}
