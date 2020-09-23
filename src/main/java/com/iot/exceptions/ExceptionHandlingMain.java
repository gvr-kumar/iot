package com.iot.exceptions;

public class ExceptionHandlingMain {

	public static void main(String[] args){
		ExceptionHandling excHandl = new ExceptionHandling();

			try {
				excHandl.throwException(8);
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Handled throwException: " + e.getMessage());
			}
		
	}

}
