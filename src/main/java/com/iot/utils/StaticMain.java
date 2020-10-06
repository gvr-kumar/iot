package com.iot.utils;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * static variables can be directly accessed using the class reference: line#35
		 * 
		 * static methods can be directly invoked using the class reference: #37
		 * 
		 * the state of static variables and methods will be maintained (the same through out) at the class level
		 * 
		 * Non static variables cannot be used in static methods whereas static variables can be used in non static methods
		 */
		
		
		
		  StaticUtils stUtils = new StaticUtils(); //stUtils-->static_var,
		  stUtils.static_var = stUtils.static_var + 10; stUtils.nonStatic_var =
		  stUtils.nonStatic_var + 10; System.out.println("stUtils.static_var: " +
		  stUtils.static_var); System.out.println("stUtils.nonStatic_var: " +
		  stUtils.nonStatic_var);
		  
		  
		  StaticUtils stUtils2 = new StaticUtils();
		  System.out.println("stUtils2.static_var: " + stUtils2.static_var);
		  System.out.println("stUtils2.nonStatic_var: " + stUtils2.nonStatic_var);
		  
		  StaticUtils stUtils1 = new StaticUtils(); stUtils1.static_var =
		  stUtils1.static_var + 10; stUtils1.nonStatic_var = stUtils1.nonStatic_var -
		  10;
		  
		  
		  System.out.println("stUtils.static_var: " + stUtils1.static_var);
		  System.out.println("stUtils.nonStatic_var: " + stUtils1.nonStatic_var);
		  
		  System.out.println(StaticUtils.static_var);
		  
		  System.out.println(StaticUtils.staticMethod());
		  
		  //calling non static methods using objects
		  
		  System.out.println(stUtils.nonStaticMethod());
		  
		  System.out.println(stUtils.nonStaticMethod_UsingStaticVar());
		 

		
		
		StaticUtils Obj1 = new StaticUtils(); //Obj1 (constInt1 =50, constInt2 =25)
		StaticUtils Obj2 = new StaticUtils(); //Obj2 (constInt1 =50, constInt2 =25)	
		
		
		//constInt1
		System.out.println(Obj1.constInt1); //constInt1=50
		
		System.out.println(Obj1.getConstInt1());			
		
		System.out.println(Obj2.constInt1);
		
		
		//constInt2
		
		System.out.println(Obj1.constInt2);
		
		System.out.println(Obj1.getConstInt2());
		
		System.out.println(StaticUtils.constInt2);
		
		
	}

}
