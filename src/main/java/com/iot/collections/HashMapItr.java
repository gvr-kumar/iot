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
	
	private static Map student = new HashMap<String, Student>();
	private static Set stdKeys = new HashSet<String>(); 
	
	//add entity
	
	public static void AddEntity(Student stdObj)
	{
		if(stdObj != null)
		{
			student.put(stdObj.getStdId(), stdObj);		
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
		Iterator<String> itr = stdKeys.iterator();
		
		while(itr.hasNext())
		{
			String id = itr.next();
			System.out.println(id);
		}
		
	}	
	
}
