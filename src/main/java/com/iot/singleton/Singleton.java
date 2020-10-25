package com.iot.singleton;

//what does synchronized method mean?

class SingletonTest {
	private static SingletonTest instance;
	
	private SingletonTest() {
		//private constructor prevents instantiation by untrusted callers
	}

	//To address the issue of multiple threads creating more than one instance of the singleton, make getInstance() a synchronized method:
	//public static synchronized SingletonTest getInstance()
	public static SingletonTest getInstance() {
		
		if(instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
			

}
