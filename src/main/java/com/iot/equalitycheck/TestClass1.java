package com.iot.equalitycheck;

public class TestClass1 {
	
	String FirstName;
	String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public TestClass1(String FirstName, String LastName)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		
		TestClass1 t1 = (TestClass1)obj;
		if(this.FirstName.equals(t1.FirstName) && this.LastName.equals(t1.LastName))
		{
			b = true;		
		}
		if(b)
			System.out.println("Objects are equal");	
		else
			System.out.println("objects are NOT equal");
		
		return b;
	}

}
