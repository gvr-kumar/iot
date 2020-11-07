package com.iot.inheritance;

//Concrete class implementing the interface

public class NonElectricCars implements CarInterface{
	
	public void getCarName()
	{
		System.out.println("Non Electric Car");
	}

	public void mileage(float noOfMiles, float gasInLitres) {
		System.out.println("Non electric cars mileage");
		
	}
	
	public void concreteMethod1()
	{
		
	}
	
	public void concreteMethod2()
	{
		
	}
	
	public void concreteMethod3()
	{
		
	}
	public void concreteMethod4()
	{
		
	}
}
