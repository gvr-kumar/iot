package com.iot.immutable;

public class MyImmutableMain {

	public static void main(String[] args) {
		
		ImmutableStudent Imm = new ImmutableStudent("XYZ",161);
		
		System.out.println(Imm.getName());
		System.out.println(Imm.getID());
	

	}

}
