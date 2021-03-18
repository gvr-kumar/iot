package com.iot.immutability.delegation;

import com.iot.cloning.Address;
import com.iot.cloning.Department;

public class C2 implements Cloneable{
	
	D2 d2 = new D2();
	
	private B2 b2;
	
	
	@Override
	protected C2 clone() throws CloneNotSupportedException {
		C2 c2 = (C2) super.clone();
		B2 be2 = b2.clone();
		c2.setB2(be2);
		return c2;
	}
	public B2 getB2() {
		return b2;
	}
	public void setB2(B2 b2) {
		this.b2 = b2;
	}

	public void iAmC(B2 b2) throws CloneNotSupportedException 
	{
		B2 b21 = b2.clone();
		b2.clone().setName("Kohli");
		
		System.out.println("I am class C, value of d2 is " +  d2);
		C2 c2  = new C2();
		d2.iAmD(b21);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "I am class C";
	}
	 

}
