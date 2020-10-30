package com.iot.collections;

import java.lang.reflect.Array;

public class SimpleArray {

	public static void main(String[] args) {
		
		ArraysHw arrHw = new ArraysHw();
		
		/*
		 * String[] StdNames = {"Kishore","Vasantha","Ravi Kumar"};;
		 * 
		 * float[] StdMarks = {100,99,90};
		 * 
		 * int[] ArrEx = new int[3]; //Arrays are objects in Java thats why we use new
		 * keyword
		 * 
		 * ArrEx[0] = 1; ArrEx[1] = 2; ArrEx[2] = 3;
		 */
		
		//Hw: take an array of size 5 and perform C,R,U,D; 
		
		
		int[] arrEx = new int[5];
		
		arrEx = arrHw.createArray();
		System.out.println("Add elements to array");
		arrHw.readArray(arrEx);
		
		arrHw.updateArray(3, 10, arrEx);

		System.out.println("Update array");
		arrHw.readArray(arrEx);
		
		/*
		 * arrHw.removElementFrmArr(3, arrEx);
		 * 
		 * System.out.println("Remove array"); arrHw.readArray(arrEx);
		 */
		
		
	}

}
