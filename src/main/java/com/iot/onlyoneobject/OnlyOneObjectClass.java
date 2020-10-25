package com.iot.onlyoneobject;

//singleton design pattern

public class OnlyOneObjectClass {
	
	static OnlyOneObjectClass oneObjClass;
	
	private OnlyOneObjectClass()
	{
		System.out.println("Instantiating");
	}
	
	public static OnlyOneObjectClass OnlyOneObjectClassMthd()
	{
		 if(oneObjClass==null)
		 {
			 oneObjClass = new OnlyOneObjectClass();
		 }
		 return oneObjClass;
	}
	
	
	 

	
	
	
	
	
	
	
	
	
	
	
	

	
}
