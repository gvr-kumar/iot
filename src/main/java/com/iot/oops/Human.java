package com.iot.oops;

public class Human {
	/*Class & object are the basic constructs of Java language.
	 *  
	 * Encapsulation: 
	 * 
	 * Abstraction:
	 * 
	 * 
	 * private members (variables & methods) can be accessed only within the same class (cannot be accessed out that class)
	 */
	
	//Instance variables
	
	private String lastName;
	private String firstName;
	private int age;
	private String country;
	private String gender;
	private String language;
	private boolean maritalStatus;
	
	//Constructors
	
	public Human() {
		super();
	}

	public Human(String lastName, String firstName, int age, String country) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.country = country;
	}	

	public Human(String gender, String language, boolean maritalStatus) {
		super();
		this.gender = gender;
		this.language = language;
		this.maritalStatus = maritalStatus;
	}

	//Getters & setters
	
	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getLanguage() {
		return language;
	}



	public void setLanguage(String language) {
		this.language = language;
	}



	/*commented intentionally as I want to restrict the visibility of this instance variable to outside world.
	 * 
	 * public boolean isMaritalStatus() { return maritalStatus; }
	 * 
	 * 
	 * 
	 * public void setMaritalStatus(boolean maritalStatus) { this.maritalStatus =
	 * maritalStatus; }
	 */


	//Methods
	
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
	private boolean maritalStatus()
	{
		return this.maritalStatus;
	}
	private void details()
	{
		maritalStatus();
	}

}
