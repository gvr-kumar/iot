package com.iot.exceptionhandling;

public class ExceptionsAssignment {
	
	public void printallexceptions() {
		
		for (int step = 0; step < 5; step++) {
			try {
				executeStep(step);
			}catch (Exception e) {
			
			  System.out.println(e);	
			}
		}
		
	}
	
	public void executeStep(int step) throws Exception{
		switch(step) {
		case 0:
			methodDivException();
			break;
		case 1:
			methodArrayLengthException();
			break;
		case 2:
			methodIntStringConvException();
			break;
		}
	}
	public void methodDivException() {
		int a=10;
		
		System.out.println(a/0);
		
	}
	
	public void methodArrayLengthException() {
		int b[] = {1,2,3,4,5};
		
		System.out.println(b[5]);
		
		
		
	}
	
	public void methodIntStringConvException() {
		String s=null;
		System.out.println(s.length());
	}
	
}
