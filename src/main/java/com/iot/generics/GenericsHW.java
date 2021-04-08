package com.iot.generics;

public class GenericsHW<T> {
	
	private static int a=0;	
	
	public GenericsHW(int a) {
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
