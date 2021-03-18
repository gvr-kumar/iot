package com.iot.immutability.supplychainservice;

import java.util.HashMap;

import com.iot.immutability.supplychainpojos.StoreLocation;

public class HeadOfficeService {
	
	private int storCount;
	
	HashMap<String, StoreLocation> storsHshMap = new HashMap<String, StoreLocation>();
	
	public void addStore(StoreLocation storLoc)
	{
		storsHshMap.put(storLoc.getStorName(), storLoc);
		
	}
	
	public void removStore(String storId)
	{
		try
		{
			storsHshMap.remove(storId);
		}
		catch(Exception e)
		{}
		
	}

}
