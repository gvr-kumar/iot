package com.iot.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 
 * Every class extends lang package object class.
 * 
 * base class reference can be assigned with child class object
 * 
 * Exceptions are the exceptional cases or the corner cases
 * 
 * Throwable is the super or base class for all exceptions and errors
 * 
 * All immediate subclasses are exceptions and errors.
 * 
 * Errors are irrecoverable whereas exceptions are recoverable.
 * 
 * 2 types of exceptions: Checked exceptions and unchecked exceptions
 * 
 * Checked exceptions: are direct child classes from exceptions classes and are also called as compile time exceptions.
 * 
 * Unchecked exceptions: are subclasses of runtime exceptions (runtime exceptions are subclasses of Exception class).
 * 
 * some of runtime exceptions are: index out of bound, array out of bound, I/O exceptions.
 * 
 * Errors: which cannot be recovered. ex: Out of memory error, stack overflow error.
 * 
 * Exceptions can be caught and rest of the program will be executed whereas errors cannot be recovered and program exits.
 * 
 * Exception handling: try, catch, throw, throws, finally
 * 
 * try, catch: 
 * 
 * if we don't know whether your program throws error or exception then use throwable
 * 
 * throws exception type should match with the catch exception type 
 * 
 */

public class ExceptionHandling {
	
	
	public void throwException(int intParam) throws Throwable //throws exception type should match with the catch exception type 
	{
		System.out.println("In throwException");
		if(intParam<=10)
		{
			throw new IOException("IOException: Throw exception from ExceptionHandling", new ArrayIndexOutOfBoundsException());
		}
		else if (intParam>=20)
		{
			ClassNotFoundException cnf = new ClassNotFoundException("ClassNotFoundException: Throw exception from ExceptionHandling");
			throw cnf; //this can also be done as line no: 38 
		}
	}
	
	public void throwExcep2(int[] intArr) throws Exception
	{
		
		System.out.println("3rd element from intArr: " + intArr[2]);
	}
	
	public int throwExcep3(int[] intArr, int indx) {
		int retVal = 0;
		
		if(indx<0)
		{
			throw new NumberFormatException("Negative Array Index");
		}
		else if(indx>intArr.length)
		{
			throw new ArrayIndexOutOfBoundsException("Array Index out of Bounds");			
		}
		else 
		{
			retVal = intArr[indx];
		}
		return retVal;
	}

}
