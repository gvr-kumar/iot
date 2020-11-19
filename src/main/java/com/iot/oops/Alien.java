package com.iot.oops;

public class Alien {
	
	String location;
	String name;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Alien(String location, String name)
	{
		this.location = location;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Human h = (Human) obj;
		return this.name.equals(h.getFirstName());
	}
}
