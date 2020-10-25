package com.iot.exceptionhandling;

public class ThrowMainClass {
	/*
	 * its a good practice to include finally block when try catch block is used.  
	 * 
	 * if we use throws then there should be a try catch block along with which finally block is used. Throw can be optional. 
	 */
	
	//Home Work: each exception should be printed separately

	public static void main(String[] args) {
		ThrowClass thrwCls = new ThrowClass();
		
		int[] intArrLst = {1,2,3,4,5,6,7,8,9,10};
		
		try {
			thrwCls.useThrow(intArrLst);
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}catch (CustomException2 e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			
		}

	}

}
