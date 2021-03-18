package com.iot.collections;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student>{

	public int compare(Student stuObj1, Student stuObj2) {
		
		return stuObj1.getStuId() - stuObj2.getStuId();
	}
		 
}
