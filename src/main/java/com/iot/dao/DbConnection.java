package com.iot.dao;

import java.sql.*;

public class DbConnection {
	
private static DbConnection instance;
	
	private DbConnection() {
		//private constructor prevents instantiation by untrusted callers
	}
	public static DbConnection getInstance() {
		
		if(instance == null) {
			instance = new DbConnection();
		}
		return instance;
	}
	
	public static Connection creatDbCon() throws SQLException
	{
		Connection con = null;
		try{  
			Class.forName("org.mariadb.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mariadb://localhost:3306/testdb","root","root123");  
			}catch(Exception e){ 
				con.close();
				System.out.println(e);} 
			
		return con;
		
	}
	
	/*
	 * public static void main(String args[]){ try{
	 * Class.forName("org.mariadb.jdbc.Driver"); Connection
	 * con=DriverManager.getConnection(
	 * "jdbc:mariadb://localhost:3306/testdb","root","root123"); Statement
	 * stmt=con.createStatement(); ResultSet
	 * rs=stmt.executeQuery("select * from tutorials_tbl"); while(rs.next())
	 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	 * con.close(); }catch(Exception e){ System.out.println(e);} }
	 */
}
