package com.iot.exceptions;

import java.io.FileNotFoundException;

public class ExceptionHandlingMain {

	/*Catch blocks should follow the parent child relationship. 
	 * 
	 * 
	 */
	
	public static void main(String[] args){
		ExceptionHandling excHandl = new ExceptionHandling();
		int[] intArr = {0,7,5};
			try {
				excHandl.throwException(8);
			} catch (Throwable e) { //throws exception type should match with the catch exception type 
				//e.printStackTrace();
				System.out.println("Handled throwException: " + e.getMessage());
			}
			try
			{
				excHandl.throwExcep3(intArr, 2);
				
				excHandl.throwExcep3(intArr, -1);
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Array Index OutOf BoundsException: " + e.getMessage());
			}
			catch(NumberFormatException e) {
				
				System.out.println("Number Format Exception: " + e.getMessage());
			}			
			catch(Exception e) {
				
				System.out.println("Exception: " + e.getMessage());
			}
			try
			{
				excHandl.throwExcep3(intArr, 4);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Array Index OutOf BoundsException: " + e.getMessage());
			}
			catch(NumberFormatException e) {
				
				System.out.println("Number Format Exception: " + e.getMessage());
			}			
			catch(Exception e) {
				
				System.out.println("Exception: " + e.getMessage());
			}
	}

}
