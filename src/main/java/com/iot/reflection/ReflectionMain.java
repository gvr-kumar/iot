package com.iot.reflection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.iot.dao.DbConnection;
import com.iot.utils.PoJoToDbUtil;

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
	
	public static void main(String[] args) throws Exception 
	{
		try {
			Connection con = DbConnection.getInstance().creatDbCon();
			Statement stmt=con.createStatement(); 
			
			System.out.println(con);
			String className = com.iot.reflection.model.Department.class.getSimpleName();
			String tblName = "tbl_" + className;
			String createTableQuery = "";
			
			ArrayList<Object> dataTypesList= new ArrayList<Object>();
			ArrayList<String> colNamesList= new ArrayList<String>();
			
			
			System.out.println(tblName);
			
			for (Field f : com.iot.reflection.model.Department.class.getDeclaredFields()) {
				//colNamesList.add(f.getName());	
				
				dataTypesList.add(f.getType().getSimpleName());
				colNamesList.add(f.getName());
				
				System.out.println(f.getType().getSimpleName());
				System.out.println(f.getName());
			}
			System.out.println(dataTypesList);
			System.out.println(colNamesList);
				
			if(dataTypesList.size() != colNamesList.size())
			{
				throw new Exception("Data types list is equal to columns names");
			}
			else 
			{
				
				String queryBuilder = PoJoToDbUtil.convertToDbType(dataTypesList, colNamesList, "deptID");
				createTableQuery = "create table if not exists " + tblName + "(" + queryBuilder + ");";
				
				System.out.println(createTableQuery);
				
				ResultSet rs=stmt.executeQuery(createTableQuery);
				
			}	 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
