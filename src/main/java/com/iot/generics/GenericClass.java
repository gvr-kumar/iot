package com.iot.generics;

public class GenericClass<T> {
	
	private T t;

	public GenericClass(T t) {
		//super(); // super refers to the parent's constructor as super is called in the constructor
		this.t = t; //this always refers to the class level instance variable.
	}

	//setter is not required as we are setting 't' in the constructor
	public T getT() {
		return t;
	}
	

}
