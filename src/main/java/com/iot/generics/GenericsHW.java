package com.iot.generics;

public class GenericsHW<T> {
	
	private static Integer a=0;	
	
	/*1) 
	*
	*
	*/
	
	public GenericsHW(Integer a, String string) {
		this.a = a;
	}

	public static int getA() {
		return a;
	}

	public GenericsHW<T> getSqr(GenericsHW<T> b)
	{
		return b;
	}
	
}
