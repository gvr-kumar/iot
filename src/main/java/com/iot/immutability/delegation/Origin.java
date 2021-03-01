package com.iot.immutability.delegation;

public class Origin {
	
	/**
	 * 
	 * Delegated Class: 
	 * 
	 * Creation Class: class in which objects are created.
	 * 
	 * Has a relationship: if we create an instance for class B inside the class or inside a method in : Origin 
	 * then we say class Origin "has a" class B 
	 * Similarly Origin has a relationship with class C
	 * 
	 * Is A relationship: When a class extends another class then we say "Is A"
	 */
	
	B b = new B("Darren");
	
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
