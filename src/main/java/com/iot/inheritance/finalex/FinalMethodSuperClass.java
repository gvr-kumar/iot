package com.iot.inheritance.finalex;

public class FinalMethodSuperClass {
	
	/*Final method: if we don't want a method to be overridden by any child class then we can declare a method as final
	 * 
	 * 
	 * 
	 */
	
	final public void finlMethod()
	{
		System.out.println("Final method");
	}
	public void notFinalMethod()
	{
		System.out.println("Not a Final method");
	}	

}
