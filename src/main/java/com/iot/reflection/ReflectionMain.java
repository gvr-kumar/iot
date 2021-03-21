package com.iot.reflection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iot.dao.DbConnection;

/**
 * metadata: data about data is called metadata
 * 
 * Reflection: 
 * 
 * java.lang.reflection
 * 
 * 
 * model object: is nothing but a pojo
 */

public class ReflectionMain {
	
	public static void main(String[] args) 
	{
		try {
			Connection con = DbConnection.getInstance().creatDbCon();
			Statement stmt=con.createStatement(); 
			
			String tblName = "tbl_" + com.iot.reflection.Employee.class.getSimpleName();
			String colNames = "";
			System.out.println(tblName);
			
			for (Field f : com.iot.reflection.Employee.class.getDeclaredFields()) {
				colNames = colNames + f.getName()+ ";";	
			}
			colNames = colNames.substring(0, colNames.lastIndexOf(";"));
			System.out.println(colNames);
			
				/*
				 * ResultSet rs=stmt.executeQuery("create table " + tblName + "(");
				 */
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Employee kishan = new Employee("E01", "Ishan, Kishan");
		
		System.out.println(kishan.getClass());
		
		for(Field f: kishan.getClass().getDeclaredFields())
		{
			System.out.println(f.getName());
		}*/
		
		
	}
	

}
