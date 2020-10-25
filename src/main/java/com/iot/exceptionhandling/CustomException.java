package com.iot.exceptionhandling;

public class CustomException extends Exception{
	
	/*
	 * Our own exception
	 * 
	 * Can create custom exceptions hierarchy
	 * 
	 */
	
	public CustomException() {
		
	}
	
	public CustomException(String msg) {
		super(msg);		
	}
	
	@Override
	public String getMessage() {		
		return super.getMessage();
	}
	
}
