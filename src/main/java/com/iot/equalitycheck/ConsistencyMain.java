package com.iot.equalitycheck;

public class ConsistencyMain {
	
	//Objects comparison using equals operator
	
	public static void main(String[] args) {
		
			TestClass1 tstClas1 = new TestClass1("Kishore", "Madina");
			
			TestClass1 tstClas2 = new TestClass1("Kishore", "Madina");
			
			tstClas1.equals(tstClas2);
			
			tstClas1.setLastName("Kumar");
			
			tstClas1.equals(tstClas2);
			
	}
}
