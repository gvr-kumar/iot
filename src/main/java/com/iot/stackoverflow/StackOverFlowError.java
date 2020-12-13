package com.iot.stackoverflow;

public class StackOverFlowError {
	
	public static void recursiveMethod()
	{
		System.out.println("Recursive method");
		recursiveMethod();
	}

	public static void main(String[] args) {
		recursiveMethod();
	}
}
