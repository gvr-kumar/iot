package com.iot.collections;

import java.util.HashMap;
import java.util.Map;

import com.iot.oops.Human;

public class MapClass {

	public static void main(String[] args) {
		
		/*Maps: key, value pairs
		 * 
		 * if we do random search, then maps are used.
		 * 
		 * 
		 */
		Human kishore = new Human("Madina", "Kishore", 25, "India");
		
		Human vasantha = new Human("Kavuri", "Vasantha", 25, "USA");
		
		Human ravi = new Human("Kumar", "Ravi", 25, "India");
		
		Map<Integer, Human> nameDB = new HashMap<Integer, Human>();
		
		nameDB.put(1, kishore);
		nameDB.put(2, vasantha);
		nameDB.put(3, ravi);
		
		System.out.println(nameDB.get(3));
	}

}
