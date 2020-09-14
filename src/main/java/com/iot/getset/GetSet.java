package com.iot.getset;

public class GetSet {
	
	
	/*
	 * POJO: Plain Old Java Object
	 * 
	 * POJO or model or VO (Value Object)
	 * 
	 * Every class extends object class by default
	 * 
	 * Getters, Setters: used to set or change the values of the instance variables.
	 * 
	 * 
	 */
	
	private String name;
	private int  age;
	private double salary;
	private boolean fulltime;
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

}
