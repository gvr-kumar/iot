package com.iot.overloading;


/*
 * Overloading: Same method name but everything else (Access type, return type, number of arguments, type of arguments) 
 * should be different in the same class
 * 
 */
public class Overloading {
	
	public int arithmeticOperation(int a, int b)
	{
		return a+b;
	}
	public int arithmeticOperation(int a, int b, int c)
	{
		return a*b*c;
	}
	
	public int arithmeticOperation(int a, int b, int c, String strMsg)
	{
		return a*b*c;
	}
	
	protected double arithmeticOperation(double a, double b)
	{
		return a/b;	
	}

}
