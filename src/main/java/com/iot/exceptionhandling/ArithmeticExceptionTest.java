package com.iot.exceptionhandling;

public class ArithmeticExceptionTest {
	Exceptions excepns = new Exceptions();
	
	public void riseArthExceptn(int a, int b) throws Exception
	{		
		excepns.divByZero(a, b);
	}

}
