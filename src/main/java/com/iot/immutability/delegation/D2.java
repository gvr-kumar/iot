package com.iot.immutability.delegation;

public class D2 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void iAmD(B2 b)
	{
		//b.setName("Rohit");
		System.out.println("I am class D2, value of B2 is " + b);
	}

	@Override
	public String toString() {
		return "I am class D2";
	}

}
