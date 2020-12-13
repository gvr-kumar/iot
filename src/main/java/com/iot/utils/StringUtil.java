package com.iot.utils;

public class StringUtil {
	
	public static String getValidString(String s)
	{
		if(s==null || s.trim().equals(""))
		{
			s= "";
		}
		else
		{
			s= s.toUpperCase();		
		}
		return s;
	}

}
