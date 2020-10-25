package com.iot.inheritance.finalex;

public class FinalMethodChildClass extends FinalMethodSuperClass {

	//final method in parent class cannot be overriden in the child class
	
	/*
	 * final public void finlMethod() { System.out.println("Final method"); }
	 */
	
	
	public void notFinalMethod()
	{
		System.out.println("Child Class: Not a Final method");
	}	
	
}
