package com.phoenix.training;

public class ArrayCrudMain {

	public static void main(String[] args) {
					
		ArrayCrudExample arrEx= new ArrayCrudExample();
		
		arrEx.createarray();
		arrEx.readArray();	
		System.out.println("=====================================");
		arrEx.addElementToArray();
		System.out.println("=====================================");
		arrEx.removeElement();				
	}
		
		
}
