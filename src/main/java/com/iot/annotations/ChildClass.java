package com.iot.annotations;

public class ChildClass extends BaseClass{
	
	int a;

	/**
	 * If a class extends another class or has a parent class and if the parent class has constructor with arguments, 
	 * then super method should be called in the child class constructor.
	 * 
	 * otherwise we have to introduce no-argument constructor in the base class. 
	 * 
	 */
	 
	public ChildClass(int a) {
		super(5);
		this.a = a;
		System.out.println("Child Class argument constructor.");
	}
	
	/*
	 * Override annotation: 
	 * 
	 * Override annotation is used to change the definition of the method but no to change the signature
	 */
	
	
	@Override
	
	public int getSqr(int b)
	{
		int x = super.getSqr(b);
		return x;
	}

}
