package com.iot.immutability.supplychainservice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.iot.immutability.supplychainpojos.StorePoJo;

public class StoreService {
	
	static Map<String, StorePoJo> inventory = new HashMap<String, StorePoJo>();
	
	/**
	 * add item to the inventory remove item
	 */
	
	public static void addItem(StorePoJo itmToAdd)
	{
		try
		{
			inventory.put(itmToAdd.getItemSku(), itmToAdd);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}	
	}
	
	/**
	 * remove item from the inventory
	*/
	public static void removeItem(String itmSku, StorePoJo itmObj)
	{
		try
		{
			inventory.replace(itmSku, itmObj);
		}
		catch(Exception e)
		{
			System.out.println("Item not found : " + e);
		}
	}
	
	/**
	 * Display items
	 * 
	 */
	
	/*
	 * public void displayItms() {
	 * 
	 * Iterator itr = new Iterator<StorePojo>() { }; }
	 */

}
