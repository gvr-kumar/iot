package com.iot.inheritance;

import com.iot.interfaces.WellsFargo;

/*Overriding: methods having same signature (same access type, same return type, same method name, same arguments, same exception clauses)
 * but with different behavior in parent and child classes. 
 * 
 * When the method is called using child class object then the super class method is overridden.
 * 
 * When the method is called using parent class object then the super class method will be executed.
 */

public class SubClass1 extends SuperClass{

	
	  public int overRiding(int a, int b) 
	  { 
		  return a+b; 
	  }
	 
	
}
