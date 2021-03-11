package com.iot.immutability.delegation;

import com.iot.cloning.Address;
import com.iot.cloning.Department;

public class Origin2{
	
	B2 b2 = new B2("Darren");
	
	public void callOrigin() throws CloneNotSupportedException
	{
		System.out.println(b2.getName());
		C2 c2 = new C2();
		c2.iAmC(b2);	
		System.out.println(b2.getName());
	}
	@Override
	public String toString() {
		return "I am class Origin";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Origin2 o = new Origin2();
		o.callOrigin();
	}

}
