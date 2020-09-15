package com.iot.interfaces;


public class BankOfAmerica implements Bank{
	/*
	 * implements keyword is used to implement the interface
	 * 
	 * in this class, all the methods should be defined (implemented)
	 * 
	 * If we don't define all the methods then implementing class should be declared as an Abstract class.
	 */
	

	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Check Current Balance");
	}

	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw money");
	}

	public void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("Deposit money");
	}

}
