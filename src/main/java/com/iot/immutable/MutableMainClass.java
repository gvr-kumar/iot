package com.iot.immutable;

public class MutableMainClass {

	public static void main(String[] args) {
		
		//HW: once object is created , object state should not be changed
		
		//https://www.hackerrank.com/challenges/grading/problem
		
		MutableClass mutClass1 = new MutableClass(10, 20);
		
		System.out.println("Before: " + mutClass1.getA());
		
		mutClass1.setA(50);
		
		System.out.println("After: " + mutClass1.getA() + ", Before mutClass1 b is " + mutClass1.getB());
	
		mutClass1.setB(120);
		
		System.out.println("After: " + mutClass1.getA() + ", After mutClass1 b is " + mutClass1.getB());
		
		MutableClass mutClass2 = new MutableClass(50, 100);
	
	
	}

}
