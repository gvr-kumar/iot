package com.iot.enumerations;

public enum Color {
	
	RED,
	GREEN,
	ORANGE;
	
	/**
	 * Constructors in enum should be always private
	 * 
	 * For each enum value in a class, no argument constructor will be executed
	 * 
	 * while generating the byte code, jdk converts the above declaration into the below:
	 * 
	 * public static final Color RED = new Color();
     * public static final Color GREEN = new Color();
     * public static final Color ORANGE = new Color();
	 * 
	 */
		
	private Color()
	{
		System.out.println("Color enum Constructor");
	}
	
	
}
