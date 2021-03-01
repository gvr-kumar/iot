package com.iot.library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Library 
{
	//private HashMap<String, Books> myBooks = new HashMap<String, Books>();
	
	
	private static Map<String, Books> Books = new HashMap<String, Books>();
	private static Set<String> BokKeys = new HashSet<String>(); 
	
	
	
	//add entity

	public static void AddEntity(Books bookObj)
	{
		if(bookObj != null)
		{
			Books.put(bookObj.getTitle(), bookObj);		
		}
	}
	
	//retrieve entity from the map
	
	public static Books RetrieveEntity(String Title)
	{
		return Books.get(Title);
	}
	
	//display all the keys 
	
	public static void DisplAllKeys()
	{
		BokKeys = Books.keySet();
		Iterator<String> itr = BokKeys.iterator();
		
		while(itr.hasNext())
		{
			String title = itr.next();
			System.out.println(title);
		}
		
	}	
	
	//display contents of the hashmap
	
	public static void displMapContnts()
	{
		BokKeys = Books.keySet();
		
		Iterator<String> itr = BokKeys.iterator();
		
		while(itr.hasNext())
		{
			Books Bok = Books.get(itr.next());
			System.out.println(Bok);
			System.out.println("\n");
		}
		
	}
	

}
