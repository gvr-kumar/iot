package com.iot.utils;

import java.util.ArrayList;

/**
 * To convert POJO to DB table  
 */

public class PoJoToDbUtil {
	
	public static String convertToDbType(ArrayList<Object> dataTypesList, ArrayList<String> colNamesList, String keyFieldName)
	{
		String colNamsDbTypesNames = "";
		for(int i = 0 ; i< dataTypesList.size(); i++) 
		{
			String dbType = "";
			
			if(dataTypesList.get(i).equals("int"))
			{
				dbType = "INT";
			}
			else if(dataTypesList.get(i).equals("String"))
			{
				dbType = "VARCHAR(100)";
			}
			if(colNamesList.get(i).equalsIgnoreCase(keyFieldName))
			{
				colNamsDbTypesNames = colNamsDbTypesNames + colNamesList.get(i) + " " + dbType + " NOT NULL AUTO_INCREMENT, ";
			}
			else
			{
				colNamsDbTypesNames = colNamsDbTypesNames + colNamesList.get(i) + " " + dbType + " NOT NULL, ";
			}
	
			
			//tutorial_id INT NOT NULL AUTO_INCREMENT,
			  // tutorial_title VARCHAR(100) NOT NULL,
			   //tutorial_author VARCHAR(40) NOT NULL,
			   //submission_date DATE,
			   //PRIMARY KEY ( tutorial_id )
		}
		System.out.println(keyFieldName);
		colNamsDbTypesNames = colNamsDbTypesNames + "PRIMARY KEY (" +keyFieldName+ ")";
		colNamsDbTypesNames = colNamsDbTypesNames.substring(0, (colNamsDbTypesNames.length()));
		System.out.println(colNamsDbTypesNames);
		return colNamsDbTypesNames;
	}

}
