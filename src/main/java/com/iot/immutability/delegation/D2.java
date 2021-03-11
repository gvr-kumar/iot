package com.iot.immutability.delegation;

public class D2 {
	
	public void iAmD(B2 b21) throws CloneNotSupportedException
	{
		b21.setName("Rohit");
		System.out.println("I am class D, value of B is " + b21);
	}

	@Override
	public String toString() {
		return "I am class D";
	}

}
