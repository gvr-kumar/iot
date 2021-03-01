package com.iot.immutability.delegation;

public class D {
	
	public void iAmD(B b)
	{
		b.setName("Rohit");
		System.out.println("I am class D, value of B is " + b);
	}

	@Override
	public String toString() {
		return "I am class D";
	}

}
