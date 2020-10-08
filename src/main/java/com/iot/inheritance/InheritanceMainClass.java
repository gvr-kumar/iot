package com.iot.inheritance;

public class InheritanceMainClass {
	
	/*Child class or derived class or sub class
	 * 
	 * Parent class or base class:
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		SuperClass supClass = new SuperClass();
		System.out.println(supClass.overRiding(2,3));
		
		SubClass1 sbCls1 = new SubClass1();
		System.out.println(sbCls1.overRiding(2,3));
		
		/*
		 * System.out.println("Subclass1: " + sbCls1.retInt());
		 * System.out.println("Subclass1: " + sbCls1.retString());
		 * 
		 * SubClass2 sbCls2 = new SubClass2(); System.out.println("Subclass2: " +
		 * sbCls2.retInt()); System.out.println("Subclass2: " + sbCls2.retString());
		 * 
		 * SubClass3 sbCls3 = new SubClass3(); System.out.println("Subclass3: " +
		 * sbCls3.retInt()); System.out.println("Subclass3: " + sbCls3.retString());
		 * 
		 * 
		 * SubClass21 sbCls21 = new SubClass21(); System.out.println("Subclass21: " +
		 * sbCls21.retInt()); System.out.println("Subclass21: " + sbCls21.retString());
		 * 
		 * SubClass22 sbCls22 = new SubClass22(); System.out.println("Subclass22: " +
		 * sbCls22.retInt()); System.out.println("Subclass22: " + sbCls22.retString());
		 * 
		 * SubClass31 sbCls31 = new SubClass31(); System.out.println("Subclass31: " +
		 * sbCls31.retInt()); System.out.println("Subclass31: " + sbCls31.retString());
		 * System.out.println("Subclass31: " + sbCls31.getC());
		 */		
	}
}
