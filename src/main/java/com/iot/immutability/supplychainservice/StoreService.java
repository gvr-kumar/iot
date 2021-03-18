package com.iot.immutability.supplychainservice;
import java.util.HashMap;
import java.util.Map;

import com.iot.immutability.supplychainpojos.StorePoJo;

public class StoreService {
	
	Map<String, StorePoJo> inventory = new HashMap<String, StorePoJo>();
	
	/**
	 * add item to the inventory remove item
	 */
	
	public void addItem(StorePoJo itmToAdd)
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
	public void removeItem(String itmSku, StorePoJo itmObj)
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

}
