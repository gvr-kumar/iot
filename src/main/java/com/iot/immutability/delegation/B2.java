package com.iot.immutability.delegation;

public final class B2{
	
	
	/*
	 * private final D2 d2;
	 * 
	 * public B2(D2 d2) {
	 * 
	 * this.d2 = d2; }
	 */
	  
	  
	 
	public D2 getD2() {
		D2 d2 = new D2();
		d2.setName(d2.getName());
		return d2;
	}

	
	@Override
	public String toString() {
		return "I am class B, ";
	}
	 
}
