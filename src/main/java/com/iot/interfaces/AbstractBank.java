package com.iot.interfaces;

public abstract class AbstractBank implements Bank{
	
	/*abstract is the keyword to declare a class as Abstract
	 * 
	 * An abstract class is not a concrete class and we cannot create instances or objects for an abstract class.
	 * 
	 * An abstract class extending another abstract class need not implement all the methods of an interface
	 * 
	 * in other words, if a parent abstract class do not implement all the methods of an interface then the 
	 * 
	 * child class also need not implement missing methods if its declared as an abstract class.
	 * 
	 * If the child class is not declared abstract then it has to define (implement) the missing methods in an interface
	 * 
	 * An Abstract class can have its own methods declared and defined.
	 */
	
	
	
	  public void checkBalance() {
	  System.out.println("Abstract Check Current Balance"); }
	  
	  public void creditCheck() 
	  { 
		  System.out.println("Abstract Credit Check"); 
	  }
	 
	
	

	

}
