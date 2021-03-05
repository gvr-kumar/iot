package com.iot.immutability.delegation;

public class C {
	
	D d = new D();
	
	public void iAmC(B b) 
	{
		b.setName("Kohli");
		
		System.out.println("I am class C, value of d is " +  d);
		C c  = new C();
		d.iAmD(b);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "I am class C";
	}
	 

}
