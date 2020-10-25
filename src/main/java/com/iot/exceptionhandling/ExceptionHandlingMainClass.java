package com.iot.exceptionhandling;

public class ExceptionHandlingMainClass {
	
	public static void main(String[] args) {
		
		//here is args is a string array
		
		System.out.println(args[0] + " ; " + args[1]);
		
		ArithmeticExceptionTest arthExcepn = new ArithmeticExceptionTest();
		
		//System.out.println(args[0].getClass());
		//System.out.println(args[1].getClass());
		
		try 
		{
			arthExcepn.riseArthExceptn(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		 }catch(Exception e) { e.printStackTrace(); //to print exception stack trace
		  
		  System.out.println("Arithmetic Exception encountered"); //abstracting the stack trace
		  //System.exit(0); //0- normal termination, anything other than0 -abnormal termination
		    
		  }	 
		System.out.println("Post Exception");		

	}

}
