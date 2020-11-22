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
	}

}
