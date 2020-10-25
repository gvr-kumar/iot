package com.iot.exceptionhandling;

public class CustomException2 extends Exception{
	
	/*
	 * Our own exception
	 * 
	 * Can create custom exceptions hierarchy
	 * 
	 */
	
	public CustomException2() {
		
	}
	
	public CustomException2(String msg) {
		super(msg);		
	}
	
	@Override
	public String getMessage() {		
		return " Custom Exception2";
	}
	
}
