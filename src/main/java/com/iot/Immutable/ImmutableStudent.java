package com.iot.Immutable;

//An Immutable class

//The class must be declared as final (So that child classes can’t be created)
//Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
//A parameterized constructor
//Getter method for all the variables in it
//No setters(To not have the option to change the value of the instance variable)

public final class ImmutableStudent {
	
	private final String name;
	private final int ID;
	
	public ImmutableStudent(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}
	
	
	public String getName() {
		return name;
	}
	public int getID() {
		return ID;
	}
		
}
