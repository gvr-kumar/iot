package com.iot.dynamicresolution;

public class DriverResolver {
	
	/*Dynamic Resolution: A base class REFERENCE can be assigned to the child class OBJECTS. 
	 *Base class need not be a concrete class but it can also be an interface or abstract class
	 * 
	 * 
	 * 
	 */
	
	public WebDriver ReturnDriver(String driverName)
	{
		WebDriver driver = null;
		if(driverName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();			
		}
		else if(driverName.equalsIgnoreCase("iedriver"))
		{
			driver = new IEDriver();
		}
			
		return driver;
	}

}
