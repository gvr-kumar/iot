package com.iot.immutability.delegation;

import com.iot.cloning.Address;
import com.iot.cloning.Department;

public class Origin{
	
	private B b = new B("Darren");;
	
	

	/*
	 * @Override protected Origin clone() throws CloneNotSupportedException { Origin
	 * orgn = (Origin) super.clone(); B b1 = (B) b.clone(); return orgn; }
	 */
	
	public void callOrigin()
	{
		System.out.println(b.getName());
		C c = new C();
		c.iAmC(b);	
		System.out.println(b.getName());
	}
	@Override
	public String toString() {
		return "I am class Origin";
	}
	
	public static void main(String[] args) {
		Origin o = new Origin();
		o.callOrigin();
	}

}
