package com.iot.oops;

public class MainClass {

	public static void main(String[] args) {
		
		Human emptyConstruct = new Human();
		
		
		
		  Human kishore1 = new Human("Madina", "Kishore", 25, "India");
		  Human kishore2 = new Human("Male", "Hindi", true, 2500.50); //instantiation of class or creating object
		  
			/*
			 * Human vasantha = new Human("Lakhsmi", "Vasantha", 25, "USA", "Female",
			 * "English", true);
			 * 
			 * Human ravi = new Human("Kumar", "Ravi", 25, "USA", "Male", "Telugu", true);
			 */
		  
		  kishore1.speak(); 
		  kishore2.write(); 
		  kishore1.work();
		  kishore2.salary();
		  
			/*
			 * vasantha.speak(); vasantha.write(); vasantha.work();
			 * 
			 * ravi.speak(); ravi.write(); ravi.work();
			 */
		 

	}

}
