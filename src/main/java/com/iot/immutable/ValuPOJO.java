package com.iot.immutable;

public class ValuPOJO {
	int age;
	String name;
	float salary;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	ValuPOJO(int age, String name, float salary)
	{
		this.age = age;
		this.name = name;
		this.salary = salary;		
	}
	
}
