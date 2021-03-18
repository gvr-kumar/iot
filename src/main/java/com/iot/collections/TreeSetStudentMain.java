package com.iot.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudentMain {

	public static void main(String[] args) {
		
		StudentNameComparator stud = new StudentNameComparator();
		StudentIDComparator studID = new StudentIDComparator();
		
		Set<Student> student = new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student stuObj1, Student stuObj2) {				
				return stuObj1.getStuId() - stuObj2.getStuId();
			}
		}) ;
		
		//Set<Student> studentName = new TreeSet<Student>(stud);
		//Set<Student> studentID = new TreeSet<Student>(studID);
		
		Student studSoma = new Student(14, "Soma");
		Student studMangal = new Student(12, "Mangal");
		Student studBudh = new Student(13, "Budh");
				
		student.add(studSoma);
		student.add(studMangal);
		student.add(studBudh);
		
		System.out.println(student);
		
		
		
	  
	}

}
