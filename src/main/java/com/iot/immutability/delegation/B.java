package com.iot.immutability.delegation;

import java.util.ArrayList;
import java.util.List;

public final class B{
	
	private final String name;
	
	private ArrayList<String> characteristics = new ArrayList<String>();
		
	public B(String name, ArrayList<String> characteristics) {
		super();
		this.name = name;
		this.characteristics = characteristics;
	}
	
		public String getName() {
		return name;
	}	
	
		
	public List<String> getCharacteristics() {
		
		ArrayList<String> charsClone = new ArrayList<String>();
		charsClone = (ArrayList<String>) characteristics.clone();
		return charsClone;
		}

		
	@Override
	public String toString() {
		return "I am class B, " + name;
	}
	 
}
