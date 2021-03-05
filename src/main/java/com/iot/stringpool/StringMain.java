package com.iot.stringpool;

public class StringMain {
	
	/**
	 * String Pool: 
	 * 
	 */
	
	public static void main(String[] args) {
	
	String s1 = "Java";
	
	String s2 = "Language";
	
	String s3 = new String("Java");
	
	System.out.println(s1==s2);
	
	System.out.println(s1==s3);
	
	}
}
