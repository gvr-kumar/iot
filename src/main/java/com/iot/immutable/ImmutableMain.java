package com.iot.immutable;

public class ImmutableMain {

	public static void main(String[] args) {
		
		ValuPOJO valPojo = new ValuPOJO(10, "Kohli", 100000.50f);
		
		
		
		ImmutableHw Imm = new ImmutableHw("XYZ",161, valPojo);
		
		Imm.getValPojo().setAge(20);
		
		
		System.out.println(Imm.getValPojo().getAge());
		
		System.out.println(Imm.getName());
		
		System.out.println(Imm.getID());
	}

}
