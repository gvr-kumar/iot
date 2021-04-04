package com.iot.generics;

public class ClassGenericMain {

	public static void main(String[] args) {
		
		GenericClass<Integer> intgr = new GenericClass<Integer>(5);
		GenericClass<Float> flt = new GenericClass<Float>(10.5f);
		GenericClass<String> str = new GenericClass<String>("Java");
		GenericClass<Integer> intgr1 = new GenericClass<Integer>(7);
		
		intgr = intgr1;
		
		System.out.println(intgr.getT());
		System.out.println(flt.getT());
		System.out.println(str.getT());
	}

}
