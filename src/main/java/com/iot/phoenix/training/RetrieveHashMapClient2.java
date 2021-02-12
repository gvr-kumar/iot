package com.iot.phoenix.training;

import com.iot.collections.HashMapItr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.iot.utils.Student;

public class RetrieveHashMapClient2 {

	public static void main(String[] args) {
		
		//This class is to retrieve a particular set of students
		
		System.out.println(HashMapItr.RetrieveEntity("StudentId10"));
		
		System.out.println(HashMapItr.RetrieveEntity("StudentId11"));		
	}
}
