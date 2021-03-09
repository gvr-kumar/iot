package com.iot.exceptionhandling;

public class OneTryMultplCatches {
	
	/**
	 * 
	 * Catch block should not be empty
	 * loops should be handled 
	 */
	
	public static void main(String[] args) 
	{
		int a=10;
		int b[] = {1,2,3,4,5};
		String s=null;
		
		try {
			
				System.out.println(b[5]);
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out of Bounds Exception");
			}
		
		try {
			
			System.out.println(s.length());
		}catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		
		try {
			System.out.println(a/0);
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		
		/*
		 * catch(Exception e) { System.out.println("Exception class: " + e); }
		 */
		
	}

}
