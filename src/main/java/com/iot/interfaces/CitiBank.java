package com.iot.interfaces;

public class CitiBank implements Bank{
	/*
	 * abstract class is defined using abstract keyword.
	 * 
	 * abstract class NEED NOT have all the definitions for the methods in the interface.
	 * Here for example, depositMoney method is not defined (implemented)
	 */
	

	public void checkBalance() {
		System.out.println("Check Current Balance-Citi");
	}

	public void withdrawal() {
		System.out.println("Withdraw money-Citi");
	}
	
	public void depositMoney() {
		System.out.println("Deposit money-Citi");
		
	}
	
	public void miniStatement()
	{
		System.out.println("Mini Statement- Citi");
	}

}
