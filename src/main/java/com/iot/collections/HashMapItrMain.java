package com.iot.collections;

import com.iot.utils.Student;

public class HashMapItrMain {

	public static void main(String[] args) {
		
		Student std1 = new Student(null, "Alex", "Alpharetta Street");
		Student std2 = new Student("Id002", "Brady", "Fulton Street");
		
		HashMapItr.AddEntity(std1);
		HashMapItr.AddEntity(std2);
		
		System.out.println(HashMapItr.RetrieveEntity("Id002"));
		
		HashMapItr.DisplAllKeys();
		

	}

}
