package com.iot.interfaces;

public class WellsFargo extends AbstractBank{
	
	//Check Balance method is from AbstractBank class

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
