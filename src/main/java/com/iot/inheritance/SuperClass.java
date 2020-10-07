package com.iot.inheritance;

public class SuperClass {
	
	int a = 20;
	String str1 = "Inheritance";
	
	public int retInt()
	{
		return a;
	}
	
	public String retString()
	{
		return str1;
	}
	
	public int overRiding(int a, int b) 
	  { 
		  return a*b; 
	  }

}
