package com.iot.inheritance;

public class FinalVariableClass {
	
	final static int a = 10;
	final static int b = 20;


	public int finalVarMethod()
	{
		//a = a+10; final static variable cannot be modified. 
		return a + b;
	}
	

}
