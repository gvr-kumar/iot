package com.iot.immutability.delegation;

import com.iot.cloning.Address;
import com.iot.cloning.Department;

public class Origin2{
	
	 B2 b = new B2();
	
	public void callOrigin()
	{
		System.out.println(b.getD2());
		C2 c = new C2();
		c.iAmC(b);	
		System.out.println(b.getD2());
	}
	@Override
	public String toString() {
		return "I am class Origin";
	}
	
	public static void main(String[] args) {
		Origin2 o = new Origin2();
		o.callOrigin();
	}

}
