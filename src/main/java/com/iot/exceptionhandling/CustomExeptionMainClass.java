package com.iot.exceptionhandling;

public class CustomExeptionMainClass {

	/*
	 * Try Catch block:
	 * 
	 * we can have multiple catch blocks from one try block.
	 * 
	 * When there are multiple catch blocks, either exception or throwable should be in the last catch block
	 * 
	 * Exceptions should be used in bottom to top approach in the catch blocks.
	 */

	public static void main(String[] args) {

		ArithmeticExceptionTest arthExc = new ArithmeticExceptionTest();

		try {
			arthExc.riseArthExceptn(10, 2);
		}  catch (CustomException e) {
			System.out.println(e.getMessage());
		}catch (Throwable e) {
			System.out.println(e.getMessage());
		} 
		finally {
			System.out.println("finally block");

		}
		System.out.println("After handling exception.");

	}

}
