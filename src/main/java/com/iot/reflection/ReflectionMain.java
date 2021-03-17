package com.iot.reflection;

import java.lang.reflect.Field;

/**
 * metadata: data about data is called metadata
 * 
 * Reflection: 
 * 
 * java.lang.reflection
 * 
 * 
 * model object: is nothing but a pojo
 */

public class ReflectionMain {
	
	public static void main(String[] args) 
	{
		Employee kishan = new Employee("E01", "Ishan, Kishan");
		
		System.out.println(kishan.getClass());
		
		for(Field f: kishan.getClass().getDeclaredFields())
		{
			System.out.println(f.getName());
		}
	}
	

}
