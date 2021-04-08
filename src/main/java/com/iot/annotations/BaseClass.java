package com.iot.annotations;

public class BaseClass {

	int a;

	public BaseClass() {
		System.out.println("Base Class def constructor.");
	}
	
	public BaseClass(int a) {
		this.a = a;
		System.out.println("Base Class argument constructor.");
	}
	
	public int getSqr(int b)
	{
		return b*b;
	}
	
	@Deprecated
	public void amDeprecated()
	{
		System.out.println("Deprecated method");
	}
	
}
