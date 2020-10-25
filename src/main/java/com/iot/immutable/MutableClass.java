package com.iot.immutable;

public class MutableClass {

	/*
	 * Mutable class: which can be changed
	 * 
	 * 
	 */
	
	int a;
	int b;
	
	public MutableClass(int a, int b) {
		this.a = a;
		this.b = b;		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
}
