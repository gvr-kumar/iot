package com.iot.strings;

public class StringsMainClass {

	public static void main(String[] args) {
		
		String s1 = "Java"; //s1 is a string literal which will be stored in string pool. String pool is a tiny memory in heap allocated for string objects.
		
		String s2 = new String("World"); //s2 will be in heap
		
		Integer a = 10; //will be stored in heap but not in string pool.
		

	}

}
