package com.iot.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.iot.utils.Student;

public class HashMapItr {
	
	/*
	 * All utilities have static methods.
	 * 
	 */
	
	private static Map<Student, Student> student = new HashMap<Student, Student>();
	private static Set<Student> stdKeys = new HashSet<Student>(); 
	
	
	
	//add entity

	public static void AddEntity(Student stdObj)
	{
		if(stdObj != null)
		{
			student.put(stdObj, stdObj);		
		}
	}
	
	//retrieve entity from the map
	
	public static Student RetrieveEntity(String stdId)
	{
		Student std = null; 
		if(student.containsKey(stdId))
		{
			std = (Student) student.get(stdId);
		}
		return std;
	}
	
	//display all the keys 
	
	public static void DisplAllKeys()
	{
		stdKeys = student.keySet();
		Iterator<Student> itr = stdKeys.iterator();
		
		while(itr.hasNext())
		{
			Student id = itr.next();
			System.out.println(id);
		}
		
	}	
	
	//display contents of the hashmap
	
	public static void displMapContnts()
	{
		stdKeys = student.keySet();
		System.out.println(stdKeys);
		Iterator<Student> itr = stdKeys.iterator();
		
		while(itr.hasNext())
		{
			Student std = student.get(itr.next());
			System.out.println(std);
		}
		
	}
}
