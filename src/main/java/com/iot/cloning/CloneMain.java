package com.iot.cloning;

public class CloneMain {

	public static void main(String[] args) {
		
		/**
		 * Delegated Class: 
		 * 
		 * Creation Class: class in which objects are created.
		 * 
		 * Cloneable interface: if we 
		 *  
		 * When we clone an object from another object then their references are different 
		 * 
		 * Only primitives can be copied when we do the shallow copy.
		 * 
		 * If we want everything (with objects) to be copied then we need to do deep copy
		 */
		
		Department cs1 = new Department("CS01", "Computer Science"); //here cs1 is a reference; new Department("CS01", "Computer Science") is an instance
		Department cs2 = null;
		Department cs3 = cs1;
		
		Address dept1Addrs = new Address("5800 Windward Pkwy", "#5800", "Alpharetta"); //consider this as deep copy
		
		//Address dept2Addrs = new Address(dept1Addrs.getAddress1(), dept1Addrs.getAddress2(), dept1Addrs.getCity());
		
		
		
		try {
			cs1.setDeptAddress(dept1Addrs);	
			
			//cs2 = new Department(cs1.getDeptId(), cs1.getDeptName());
			//cs2.setDeptAddress(dept2Addrs);
			
			
			 cs2 = cs1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		dept1Addrs.setCity("Atlanta");
		
		//dept1Addrs = new Address("Rodeo Drive", "Hollywood", "Los Angeles"); 
		
		//cs1.setDeptAddress(dept1Addrs);
		
		cs1.setDeptName("ECE");
		
		System.out.println("CS1: " + cs1);
		System.out.println("CS2: " + cs2);
		
		//System.out.println(cs1==cs2);
		//System.out.println(cs1==cs3);
	}

}
