package com.iot.interfaces;

public class InterfaceMain {

	//this is the main method
	
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 */
		
		BankOfAmerica bofa = new BankOfAmerica();
		CitiBank citi = new CitiBank();
		WellsFargo wf = new WellsFargo();
		
		bofa.creditCheck();
		//citi.creditCheck(); --> Citi bank canot access creditCheck() because this is defined in the AbstractBank class.
		wf.creditCheck(); // creditCheck() in the WellsFargo is executed because it is overridden.
		
		citi.checkBalance(); //this will be called from CitiBank 
		wf.checkBalance(); //this will be called from AbstractBank
		
		
		

	}

}
