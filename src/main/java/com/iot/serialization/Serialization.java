package com.iot.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	
	/**
	 * Serialization: Converting the state of an object into byte stream. 
	 * 
	 * .ser is the extension for the serialized files.
	 * 
	 * Marker interface: java.io.serializable is the markers interface.
	 * 
	 * In our example, we will serialize (persist) an object into a file and then deserialize the file and read the contents. 
	 * 
	 * Deserialization: Converting the state of received byte stream into an original object.
	 * 
	 * to save files in the database, all databases support data type BLOB (Binary Large Object), CLOB (Character Large Object)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Employee manishP = new Employee("Emp01", "Manish Pandey", 2000.25f);
		
		Employee sirajM = new Employee("Emp02", "Siraj Mohammed", 3000.50f);
		
		try {
			FileOutputStream fileOP = new FileOutputStream("/Users/gangineni/documents/myfiles/Employee.ser");
			
			ObjectOutputStream objOpStrm = new ObjectOutputStream(fileOP);
			
			objOpStrm.writeObject(manishP);
			
			objOpStrm.writeObject(sirajM);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
