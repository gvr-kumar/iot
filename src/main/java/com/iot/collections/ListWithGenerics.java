package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

import com.iot.inheritance.Acura;
import com.iot.inheritance.BMW;
import com.iot.inheritance.CarInterface;
import com.iot.inheritance.Honda;
import com.iot.inheritance.SuperClass;
import com.iot.inheritance.Tesla;
import com.iot.interfaces.Bank;
import com.iot.interfaces.BankOfAmerica;
import com.iot.interfaces.CitiBank;
import com.iot.interfaces.WellsFargo;

public class ListWithGenerics {

	public static void main(String[] args) {
		
		/*
		 * Generics are introduced in Java5.
		 * 
		 * arraylist with generic types accepts only those types.
		 * 
		 * derived class objects (interfaces, super) can also be added to a collection
		 * 
		 * 
		 */
		
		BankOfAmerica bofa = new BankOfAmerica();
		
		CitiBank citi = new CitiBank();
		
		WellsFargo wf = new WellsFargo();
		
		Acura acura = new Acura();
		
		Honda honda = new Honda();
		
		BMW bmw = new BMW();
		
		Tesla tesla = new Tesla();
		
		List<Integer> intArrList = new ArrayList<Integer>();
		
		ArrayList<String> strArrList = new ArrayList<String>();
		
		ArrayList<Boolean> boolArrList = new ArrayList<Boolean>();
		
		ArrayList<SuperClass> suprClasArrList = new ArrayList<SuperClass>();
		
		List<Bank> bnkList = new ArrayList<Bank>(); //derived class objects (interfaces, super) can also be added to a collection

		List<CarInterface> carsList = new ArrayList<CarInterface>();
		
		intArrList.add(10000);
		intArrList.add(20000);
		intArrList.add(30000);
		intArrList.add(40000);
				
		bnkList.add(bofa);
		bnkList.add(citi);
		bnkList.add(wf);
		
		carsList.add(honda);
		carsList.add(acura);
		carsList.add(bmw);
		carsList.add(tesla);
		
		System.out.println("---------Integer Array List--------");
		
		for(int i=0;i<intArrList.size();i++)
		{
			System.out.println(intArrList.get(i));
		}
		System.out.print("\n");
		
		System.out.println("---------BANKS--------");
		
		for(int i=0;i<bnkList.size();i++)
		{
			Bank b = bnkList.get(i);
			b.getBankName();
		}
		System.out.print("\n");
		
		//H.W: create a list with super class and child class objects, also include abstract class, ex: fruits or cars
		
		System.out.println("---------CARS--------");
		for(CarInterface tmp: carsList)
		{
			tmp.getCarName();
		}
	}

}
