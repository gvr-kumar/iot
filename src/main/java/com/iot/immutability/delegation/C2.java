package com.iot.immutability.delegation;

public class C2 {
	
	D2 d = new D2();
	
	public void iAmC(B2 b) 
	{
		d.setName("Kohli");
		
		System.out.println("I am class C, value of d is " +  d);
		C2 c  = new C2();
		d.iAmD(b);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "I am class C";
	}
	 

}
