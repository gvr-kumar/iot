package com.iot.generics;

public class GenericsHW<T> {

	private int c;
	
	private T a;
	private T b;

	public GenericsHW(T a, T b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c; 
	}

	public T print() {
		return (T) (a + " " + b + c);
	}

}
