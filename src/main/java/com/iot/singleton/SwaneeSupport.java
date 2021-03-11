package com.iot.singleton;

//what does synchronized method mean?

class SwaneeSupport {
	private static SwaneeSupport instance;
	
	
	
	private SwaneeSupport() {
		//private constructor prevents instantiation by untrusted callers
	}
	
	

	//To address the issue of multiple threads creating more than one instance of the singleton, make getInstance() a synchronized method:
	//public static synchronized SingletonTest getInstance()
	public static SwaneeSupport getInstance() {
		
		if(instance == null) {
			instance = new SwaneeSupport();
		}
		return instance;
	}
			

}
