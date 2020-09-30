package com.iot.oops;

public class MainClass {

	public static void main(String[] args) {
		
		Human kishore = new Human("Madina", "Kishore", 25, "India", "Male", "Hindi");
		
		Human vasantha = new Human("Lakhsmi", "Vasantha", 25, "USA", "Female", "English");
		
		Human ravi = new Human("Kumar", "Ravi", 25, "USA", "Male", "Telugu");
		
		kishore.speak();
		kishore.write();
		kishore.work();
		
		vasantha.speak();
		vasantha.write();
		vasantha.work();
		
		ravi.speak();
		ravi.write();
		ravi.work();

	}

}
