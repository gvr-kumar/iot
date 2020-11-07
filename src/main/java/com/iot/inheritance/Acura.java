package com.iot.inheritance;

//Concrete class which extends another concrete class that implements interface, it can override the abstract class methods and should have all the methods declared in the interface.

public class Acura extends NonElectricCars{
	
	public void getCarName() {
		System.out.println("Acura");
	}

	public void mileage(float noOfMiles, float gasInLitres) {
		System.out.println("Acura nonelectric car mileage");
		
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
	public void acuraOwnMethod()
	{
		
	}
}
