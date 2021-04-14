package com.iot.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 
 * @author gangineni
 *
 *
 *why it does not allow us to add objects to a collection with extended generics
 *but why it allows us to do with super?
 *
 *
 *
 */

public class ExtendedGenerics {
	
	public static ArrayList<? extends ElectricCar> extndsCopy(ArrayList<? extends ElectricCar> elecCarListExtends)
	{
		return elecCarListExtends;
	}
	
	public static void main(String[] args) {
		
		
		
		
		ArrayList<? super ElectricCar> elecCarListSuper = new ArrayList();
		
		ArrayList<? extends ElectricCar> elecCarListExtends = new ArrayList();
		
		ArrayList elecCarListDummy = new ArrayList();
		
		Tesla tsla = new Tesla();
		Honda hnda = new Honda();
		NissanLeaf nisnLeaf = new NissanLeaf();
		
		Collections.addAll(elecCarListSuper, tsla, hnda, nisnLeaf);
		
		Collections.addAll(elecCarListDummy, tsla, hnda, nisnLeaf);
		
		//Collections.copy(elecCarListDummy, elecCarListSuper);
		
		elecCarListExtends = extndsCopy(elecCarListDummy);
		
		
		//Collections.copy(elecCarListExtends, elecCarListDummy);
		
		System.out.println("----Super----");
		
		Iterator<ElectricCar> itrSuper = (Iterator<ElectricCar>) elecCarListSuper.iterator();
		
		while(itrSuper.hasNext())
		{
			ElectricCar e = itrSuper.next();
			System.out.println(e.getMake() + " - " + e.getPrice());
		}
		
		System.out.println("----Extends----");
		
		System.out.println(elecCarListExtends.size());
		
		Iterator<ElectricCar> itrExtends = (Iterator<ElectricCar>) elecCarListExtends.iterator();
		
		while(itrExtends.hasNext())
		{
			ElectricCar e = itrExtends.next();
			System.out.println(e.getMake() + " - " + e.getPrice());
		}
		
	}
}
