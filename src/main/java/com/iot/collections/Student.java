package com.iot.collections;

public class Student implements Comparable <Student>{
	
	private int stuId;
	private String stuName;
	
	public Student(int stuId, String stuName)
	{
		this.stuId = stuId;
		this.stuName = stuName;	
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
   
	@Override
	public String toString() {
        return "StudentTreeSet{" +
                "id=" + stuId +
                ", name='" + stuName + '\'' +
                '}';
	}

	public int compareTo(Student stuId) {
		
		return stuId.getStuId() - this.getStuId();
	} 
}
