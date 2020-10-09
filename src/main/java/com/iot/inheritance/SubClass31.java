package com.iot.inheritance;

public class SubClass31 extends SubClass3{
	
	/*
	 * super is a keyword used to access immediate parent's variables, methods and constructors in its child class.
	 * 
	 * this refers to the current class variables, methods and constructors.
	 */
	
	int c = 100;
	
	public int getC()
	{
		System.out.println("var c in Subclass31, var c in Subclass3: " + this.c + ", "+ super.c);
		return super.c;
	}
	
	public void print()
	{
		super.printC();
	}

}
