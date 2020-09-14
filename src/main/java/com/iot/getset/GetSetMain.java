package com.iot.getset;

public class GetSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSet getSet = new GetSet();
		getSet.setName("Java");
		
		getSet.setName("Lang");
		String nameMainClass = getSet.getName();
		
		System.out.println("nameMainClass: " + nameMainClass);

	}

}
