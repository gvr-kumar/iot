package com.iot.inheritance;

//Abstract class which implements interface, which has its owns methods.

public abstract class ElectricCar implements CarInterface{
	
	public void abstractMethod1()
	{
		
	}
	
	public void abstractMethod2()
	{
		
	}	
	
	public void mileage(float noOfMiles, float batteryCapacity)
	{
		System.out.println("Electric Car mileage method");
	}

}
