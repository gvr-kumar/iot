package com.iot.wrapperclassautoboxingunboxing;

//Creating a custom Wrapper class 

public class Calculator {
	
	private int a;
	private int b;
	private int c;
	Calculator()
	{
		
	}
	
	Calculator(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public int addition()
	{
		c= a + b;
		return c;
	}

}
