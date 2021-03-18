package com.iot.immutability.delegation;

import com.iot.cloning.Address;

public  class B2 implements Cloneable{
	
	String name;
		
	public B2(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	protected B2 clone() throws CloneNotSupportedException {

		return (B2) super.clone();
	}
	
	@Override
	public String toString() {
		return "I am class B2, " + name;
	}
	 
}
