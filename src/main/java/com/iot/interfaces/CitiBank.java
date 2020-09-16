package com.iot.interfaces;

public abstract class CitiBank implements Bank{
	/*
	 * abstract class is defined using abstract keyword.
	 * 
	 * abstract class NEED NOT have all the definitions for the methods in the interface.
	 * Here for example, depositMoney method is not defined (implemented)
	 */
	

	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Check Current Balance");
	}

	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw money");
	}

}
