package com.iot.dynamicresolution;

public class DynamicResolutionMain {
	
	/*Dynamic Resolution: A base class REFERENCE can be assigned to the child class OBJECTS. 
	 *Base class need not be a concrete class but it can also be an interface or abstract class
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		DriverResolver drivResolvr = new DriverResolver();
		
		/*
		 * WebDriver chrdriver = new ChromeDriver(); 
		 * WebDriver iedriver = new IEDriver(); 
		 * AbstractDriver abDriver = new ChromeDriver();
		 */
		
		drivResolvr.ReturnDriver("Chrome").driverName();
		drivResolvr.ReturnDriver("IEDriver").driverName();
		
		
	}
	
}
