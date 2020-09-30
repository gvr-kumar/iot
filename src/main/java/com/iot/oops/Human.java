package com.iot.oops;

public class Human {
	/*Class & object are the basic constructs of Java language.
	 *  
	 * Encapsulation: 
	 * 
	 * Abstraction:
	 * 
	 */
	String lastName;
	String firstName;
	int age;
	String country;
	String gender;
	String language;
	boolean maritalStatus;
	
	Human(String ln, String fn, int ag, String cntry, String gndr, String lang)
	{
		this.lastName = ln;
		this.firstName = fn;
		this.age = ag;
		this.country = cntry;
		this.gender = gndr;
		this.language = lang;
	}
	
	public void speak()
	{
		System.out.println(this.firstName + " can speak " + this.language);
	}
	
	public void write()
	{
		System.out.println(this.firstName + " can write " + this.language);
	}
	public void work()
	{
		System.out.println(this.firstName + " work in " + this.country);
	}

}
