package com.iot.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserilization {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fileIpStrm = new FileInputStream("/Users/gangineni/documents/myfiles/Employee.ser");
			ObjectInputStream objIpstrm = new ObjectInputStream(fileIpStrm);
			
			ArrayList<Employee> objsList = new ArrayList<Employee>();
			
			try
			{
				boolean loop = true;
				
				//while(loop)
					
				while(objIpstrm != null)	
				{	
				
					Employee e = (Employee)objIpstrm.readObject();
					
					if(e != null)
					{
						objsList.add(e);
						System.out.println(e);
					}
					else
					{
						loop = false;
					}
				}
				
			}
			catch (Exception e) {
				System.out.println("End of ser file.");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
