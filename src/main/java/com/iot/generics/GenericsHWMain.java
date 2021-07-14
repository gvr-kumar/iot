package com.iot.generics;

public class GenericsHWMain {

	public static void main(String[] args) {
		
		GenericsHW<Integer> ghInt = new GenericsHW<Integer>(5, 10, 50);
		
		GenericsHW<String> ghStr = new GenericsHW<String>("Java", "Language", 100);
		
		System.out.println(ghInt.print());
		System.out.println(ghStr.print());

	}

}
