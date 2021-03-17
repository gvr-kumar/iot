package com.iot.collections;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>{

		public int compare(Student stuObj1, Student stuObj2) {
			
			return stuObj1.getStuName().compareTo(stuObj2.getStuName());
		}
		
}


