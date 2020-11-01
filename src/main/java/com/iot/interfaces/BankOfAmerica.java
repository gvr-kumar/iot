package com.iot.interfaces;


public class BankOfAmerica extends AbstractBank{
	/*
	 * implements keyword is used to implement the interface
	 * 
	 * in this class, all the methods should be defined (implemented)
	 * 
	 * If we don't define all the methods then implementing class should be declared as an Abstract class.
	 */
	
	public void getBankName()
	{
		System.out.println("Bank Of America");
	}
	
	
	public void checkBalance() {
		System.out.println("Check Current Balance-BOFA");
	}

	public void withdrawal() {
		System.out.println("Withdraw money-BOFA");
	}

	public void depositMoney() {
		System.out.println("Deposit money-BOFA");
	}

}
