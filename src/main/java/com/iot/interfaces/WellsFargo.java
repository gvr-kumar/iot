package com.iot.interfaces;

public class WellsFargo extends AbstractBank{
	
	/* A concrete class which extends an abstract class must implement the abstract (unimplemented) methods which do not have method definition.
	 * 
	 * If a class does not implement any abstract (unimplemented) methods then that class also need to be ABSTRACT
	 * 
	 * 
	 * 
	 * Check Balance method is from AbstractBank class
	 */

	public void withdrawal() {
		System.out.println("Withdraw money-WellsFargo");
	}

	public void depositMoney() {
		System.out.println("Deposit money-WellsFargo");
	}

	public void creditCheck() {
		System.out.println("Wells Fargo Credit Check");
	}	

}
