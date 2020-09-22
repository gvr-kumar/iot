package com.iot.interfaces;

/*
 * Base class (Interface) reference can be assigned with derived class instance (object)
 * 
 * resolving instances dynamically
 */

public class DynamicResolutionMain {
	
	private static AbstractBank getInstance(String strParam)
	{
		if(strParam.equalsIgnoreCase("wells"))
		{
			return new WellsFargo();
		}
		else if(strParam.equalsIgnoreCase("boa"))
		{
			return new BankOfAmerica();
		}
		return null;	//	
			
	}
	private static Bank getInstance(int intParam)
	{
		if(intParam == 0)
		{
			return new CitiBank();
		}
		else if(intParam == 1)
		{
			return new BankOfAmerica();
		}
		return new WellsFargo();		
			
	}
	
	public static void main(String[] args) {
		
		
		getInstance("wellsfargo").checkBalance();
		Bank bnk = new WellsFargo();
		bnk.checkBalance();
		
		/*
		 * Hdfc object cannot access getInstance method as the HDFC class do not implement Bank 
		 * and do not extend AbstractBank
		 */
		
		Hdfc hdfc = new Hdfc();
		

	}

}
