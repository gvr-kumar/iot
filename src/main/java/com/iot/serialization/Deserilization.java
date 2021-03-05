package com.iot.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fileIpStrm = new FileInputStream("/Users/gangineni/documents/myfiles/Employee.ser");
			
			ObjectInputStream objIpstrm = new ObjectInputStream(fileIpStrm);
			
			Employee e = (Employee)objIpstrm.readObject();
			
			System.out.println(e);
			
			//Homework: multiple objects
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
