package com.iot.inheritance;

public interface CarInterface {
	
	public static boolean Engine = true;
	
	public boolean emission = false;
	
	public boolean autoPilot = false;
	
	public boolean isElectric = false;
	
	/*
	 * public void getCarType();
	 * 
	 * public void getEngineType();
	 */

	
	public void getCarName();
	
	public void mileage(float noOfMiles, float gasInLitres);
	
	public void concreteMethod1();
	
	public void concreteMethod2();
	
	public void concreteMethod3();
	

}
