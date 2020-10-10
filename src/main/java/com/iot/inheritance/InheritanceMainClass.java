package com.iot.inheritance;

public class InheritanceMainClass {
	
	/*Child class or derived class or sub class
	 * 
	 * Parent class or base class:
	 * 
	 * A final class cannot be extended or cannot be a parent class
	 *
	 * Final methods cannot be overridden
	 * 
	 * 
	 * 
	 * An abstract class cannot be final
	 */

	public static void main(String[] args) {
		
		/*
		 * SuperClass supClass = new SuperClass();
		 * System.out.println(supClass.overRiding(2,3));
		 * 
		 * SubClass1 sbCls1 = new SubClass1();
		 * System.out.println(sbCls1.overRiding(2,3));
		 * 
		 * FinalMethodClass finMethClas = new FinalMethodClass();
		 * 
		 * finMethClas.method1();
		 * 
		 * System.out.println(FinalVariableClass.a);
		 */// Final static variables can be directly accessed using the class name and no need of object
		
		SubClass31 subclas31 = new SubClass31();
		subclas31.getC();
		subclas31.printC();
		
		
		
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
