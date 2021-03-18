package com.iot.immutability.delegation;

import java.util.ArrayList;
import java.util.List;

import com.iot.cloning.Address;
import com.iot.cloning.Department;

public class Origin{
	
	/**
	 * when nominating a class as immutable and if the class contains mutable instance variables,
	 * we should treat them separately (then we should use clone)
	 * Immutability is applicable only for POJOs (classes that contain instance variables, constructor)
	 * Classes that contains methods (service layer) is always mutable.
	 */
	
	public void callOrigin(B b)
	{
		System.out.println(b.getName());
		C c = new C();
		c.iAmC(b);	
		System.out.println(b.getName());
	}
	@Override
	public String toString() {
		return "I am class Origin";
	}
	
	public static void main(String[] args) {
		ArrayList<String> chars = new ArrayList<String>();
		
		chars.add("5.9");
		chars.add("dark");
		
		B b = new B("Darren", chars);
		
		System.out.println("Characteristics before callorigin: " + b.getCharacteristics());
		
		
		Origin o = new Origin();
		
		o.callOrigin(b);
		
		System.out.println("Characteristics after callorigin: " + b.getCharacteristics());
	}

}
