package com.iot.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		//Comparable
		
		CompObjs kishore = new CompObjs("Kishore", "Hyderabad, India", 25);
		CompObjs kumar = new CompObjs("Kumar", "Guntur, India", 30);
		CompObjs vasantha = new CompObjs("Vasantha", "Charlotte, USA", 21);
		CompObjs ravi = new CompObjs("Ravi", "Alpharetta, USA", 30);

		
		System.out.println(kishore.compareTo(vasantha));
		System.out.println(kishore.compareTo(kumar));
		System.out.println(ravi.compareTo(kumar));
		
		List<CompObjs> objsList = new ArrayList<CompObjs>();
		
		Collections.addAll(objsList, kishore, kumar, vasantha, ravi);
		
		System.out.println("----Before sort---");
		
		System.out.println(objsList);
		
		System.out.println("----after sort---");
		
		Collections.sort(objsList); //sorting the objects
		
		System.out.println(objsList);
		
		
		//*****************************************VC Part*****************************************************
				
		List<String> fruitsList = new ArrayList<String>();
		
		fruitsList.add("Apple");
		fruitsList.add("Strawberry");	
		fruitsList.add("Pear");
		fruitsList.add("Mango");
				
		List<String> chocolatesList = new ArrayList<String>();
		chocolatesList.add("Hershey'sKisses");
		chocolatesList.add("Cadbury");
		chocolatesList.add("Lindtor");
		chocolatesList.add("M&Ms");
		
		GiftBasket fruitBasket1 = new GiftBasket("Fruit",12,12.5f);
		fruitBasket1.setBasketList(fruitsList);
		
		
		//GiftBasket fruitBasket2 = new GiftBasket("Mango",24,6.99f);
	    
		GiftBasket chocolateBasket1 = new GiftBasket("Chocolate",10,4.99f);
		//GiftBasket chocolateBasket2 = new GiftBasket("Hersheys",9,9.99f); 
		chocolateBasket1.setBasketList(chocolatesList);
		
		List<GiftBasket> GiftBasketList = new ArrayList<GiftBasket>();
		
		Collections.addAll(GiftBasketList, fruitBasket1,chocolateBasket1);
		
		System.out.println("=================================");
		System.out.println("****Before Sort****");
		
		
		System.out.println(GiftBasketList);
		
		System.out.println();
		
		
		Collections.sort(GiftBasketList);
		
		System.out.println("****After Sort****");
		
		System.out.println(GiftBasketList);
		
		System.out.println();		
		
	}

}
