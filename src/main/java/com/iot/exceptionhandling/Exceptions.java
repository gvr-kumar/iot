package com.iot.exceptionhandling;

public class Exceptions {
	
	
	
	/* By default any class in Java extends Object class
	 *  
	 *  Throwable is the base class for Exceptions and Errors.
	 *  
	 *  Exception is the base class for all exceptions both checked and unchecked.
	 *  
	 *  Exceptions stack trace follow bottom to top approach when printing the stack trace in console
	 *  
	 *  
	 *  Any of the direct child classes (like arithmetic, null pointer) of the Runtime Exception class will not throw compile time errors OR exception
	 *  
	 *  Any direct child classes (IO, SQL) of Exception class will throw compile time errors or exceptions.
	 *  
	 *  We cannot recover from Run Time Exceptions unless we have 'Exception' or 'Throwable' catch block
	 *  
	 *  
	 *  Imp: If a method has 'throws' then wherever that method is called or invoked then 
	 *  that surrounded method also should have throws or wrapped with try, catch.
	 *  
	 *  
	 * 1)  Exceptions:two types of exceptions 
	 * 
	 * a) Compile time exceptions (checked exceptions)
	 * 
	 * b) Runtime exceptions (Unchecked exceptions)
	 * 
	 * 5 constructs in exception handling:
	 * 
	 *  try, catch, throw, throws, finally
	 * 
	 * 
	 * 2) Errors:
	 * 
	 * ex: out of memory, network connection errors
	 * 
	 * throws: we always should use 'throws Exception or Throwable' for the methods that we write
	 * 
	 * and if we are invoking or calling or using any methods, we should handle or catch the exceptions using try catch
	 */
	
	public void divByZero(int a, int b) throws CustomException
	{
		//System.out.println(a/b);
		
		int intArr[]= {1,2,3,4,5};
		
		System.out.println(intArr[2]);
	}
	
	
	

}
