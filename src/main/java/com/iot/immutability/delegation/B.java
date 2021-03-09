package com.iot.immutability.delegation;

public class B{
	
	private String name;
		
	public B(String name) {
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
	protected Object clone() throws CloneNotSupportedException {
		return (B)super.clone();
	}

	
	@Override
	public String toString() {
		return "I am class B, " + name;
	}
	 
}
