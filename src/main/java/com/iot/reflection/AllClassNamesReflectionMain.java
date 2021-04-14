package com.iot.reflection;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;

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

public class AllClassNamesReflectionMain {
	
	public static void main(String[] args) throws Exception 
	{
		try {
			Connection con = DbConnection.getInstance().creatDbCon();
			Statement stmt=con.createStatement(); 
			
			System.out.println(con);
			
			Reflections reflections = new Reflections("com.iot.reflection.model");

			/*
			 * //Set<Class> allClasses = reflections.get // getSubTypesOf(Object.class);
			 * 
			 * //System.out.println(allClasses.size());
			 * 
			 * //Iterator<Class<? extends Object>> itr = allClasses.iterator();
			 * 
			 * while(itr.hasNext()) { Class<? extends Object> cls = itr.next();
			 * System.out.println(cls); }
			 */
				 
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
