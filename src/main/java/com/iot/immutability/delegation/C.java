package com.iot.immutability.delegation;

public class C {
	
	D d = new D();
	
	public void iAmC(B b) 
	{
		System.out.println("I am class C, value of d is " +  d);
		C c  = new C();
		b.getCharacteristics().add("6.0");
		b.getCharacteristics().add("fair");
		
		d.iAmD(b);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "I am class C";
	}
	 

}
