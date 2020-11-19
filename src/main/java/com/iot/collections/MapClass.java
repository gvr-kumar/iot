package com.iot.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.iot.oops.Alien;
import com.iot.oops.Human;

public class MapClass {

	public static void main(String[] args) {
		
		
		/*
		 * Equality of objects is done for same class type but should not be done for different class types.
		 * 
		 * Class cast exception: run time exception
		 */
		
		Human ravi1 = new Human("Kumar", "Ravi", 25, "India");
		
		Human ravi2 = new Human("Kumar Varma", "Ravi", 26, "USA");
		
		Human human3 = new Human("Pk", "Pk", 100, "India");
		
		Alien alien1 = new Alien("Saturn", "PK");
		
		int a = 10;
		int b = 20;
		
		String s1 = "Test";
		
		String s2 = "Test";
		
		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		/*
		 * if(ravi2.equals(ravi1)) { System.out.println("ravi1 is equal to ravi2"); }
		 */
		if(s1==s2)
		{
			System.out.println("s1 is equal to s2");
		}
		
		if(human3.equals(alien1))
		{
			System.out.println("human3 is equal to alien1");
		}
		
		
		if(alien1.equals(human3))
		{
			System.out.println("alien1 is equal to human3");
		}
		
		
		/*Maps: key, value pairs
		 * 
		 * if we do random search, then maps are used.
		 * 
		 * 
		 */
		Human kishore = new Human("Madina", "Kishore", 25, "India");
		
		Human vasantha = new Human("Kavuri", "Vasantha", 25, "USA");
		
		
		
		Map<Integer, Human> nameDB = new HashMap<Integer, Human>();
		
		nameDB.put(1, kishore);
		nameDB.put(2, vasantha);
		nameDB.put(3, ravi1);
		
		System.out.println(nameDB);
		
		System.out.println(nameDB.get(3)); 
		
		List<Integer> intList= new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println(intList);//
		
		
	}

}
