package com.iot.wrapperclassautoboxingunboxing;

//Creating a custom Wrapper class 

public class Calculator {
	
	private int a;
	private int b;
	private int c;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int addition(int a, int b)
	{
		c= a + b;
		return c;
	}
	public int substract(int a, int b)
	{
		c= a - b;
		return c;
	}
	public int multiply(int a, int b)
	{
		c= a * b;
		return c;
	}
	
	public int division(int a, int b)
	{
		c= a / b;
		return c;
	}
	

}
