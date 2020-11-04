package com.iot.interfaces;

public interface Bank{

	/*An Interface contains only method declarations. Their definitions (implementations) are 
	 * provided inside the classes (can be abstract or a concrete class) which implement these interfaces.
	 * 
	 * interface keyword is used to define an Interface.
	 * 
	 * Interfaces can be extended by multiples classes. 
	 * 
	 * All interfaces methods should be public
	 * 
	 * An interface can extend another interface.
	 * 
	 * Interfaces cannot be instantiated meaning we cannot create objects for interfaces. 
	 */
	
	public void checkBalance();
	
	public void withdrawal();
	
	public void depositMoney();
	
	public void getBankName();
	
}
