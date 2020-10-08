package com.iot.overloading;

public class OverloadMainClass {

	public static void main(String[] args) {
		
		Overloading overload = new Overloading();
		System.out.println(overload.arithmeticOperation(2, 3));
		System.out.println(overload.arithmeticOperation(2, 3, 4));
		System.out.println(overload.arithmeticOperation(2, 3, 4, "Multiply"));
		System.out.println(overload.arithmeticOperation(4.246, 2.4));

	}

}
