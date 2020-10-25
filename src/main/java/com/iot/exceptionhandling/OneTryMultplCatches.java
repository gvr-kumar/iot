package com.iot.exceptionhandling;

public class OneTryMultplCatches {
	
	
	
	public static void main(String[] args) 
	{
		int a=10;
		int b[] = {1,2,3,4,5};
		String s=null;
		
		try {
			
			System.out.println(b[5]);
			
			System.out.println(s.length());
		
			System.out.println(a/0);
			
			
		}catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out of Bounds Exception");
		}
		catch(Exception e)
		{
			System.out.println("Exception class: " + e);
		}
	}

}
