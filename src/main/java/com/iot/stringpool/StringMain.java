package com.iot.stringpool;

public class StringMain {
	
	/**
	 * String Pool: For all strings in a JVM, string pool is created 
	 * in which if value of any 2 or more string literals are equal, then it points to the same reference.
	 * 
	 * String pool is a separate memory space in each JVM's heap for all string literals.
	 * 
	 * Strings & all wrapper classes are immutable
	 */
	
	public static void main(String[] args) {
	
	String s1 = "Java";
	

	
	String s2 = "Language";
	
	String s3 = new String("Java"); //new reference is created
	
	//s3 (left side) is the reference, new String("Java") (right side) is the instance
	
	String s4 = "Java";
	
	System.out.println(s1==s2);
	
	System.out.println(s1==s3);
	
	System.out.println(s1 == s4);
	
	System.out.println("--Equals Method--");
	
	System.out.println(s1.equals(s3));
	
	System.out.println(s1.equals(s4));
	
	String s5, s6 = "Java";
	
	s1= "C++";
	
	System.out.println(s1);
	
	}
}
