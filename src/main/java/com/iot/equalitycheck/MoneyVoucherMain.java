package com.iot.equalitycheck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MoneyVoucherMain {

	public static void main(String[] args) {
		Money m1 = new Money(500.50f, "Rupees");
		Money m2 = new Money(500.50f, "Rupees");
		
		
		
		Voucher v = new Voucher("Hyderabad", 500.50f, "Rupees");
		
		//null check on hosting check should happen
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		System.out.println(m1.equals(m2));
		
		/*
		 * if(m != null && m.equals(v)) { System.out.println("m is equal to v"); } else
		 * { System.out.println("m is NOT equal to v"); }
		 * 
		 * //null check on hosting check should happen
		 * 
		 * if(v != null && v.equals(m)) { System.out.println("v is equal to m"); } else
		 * { System.out.println("v is NOT equal to m"); }
		 */
		
		
		  Set set1 = new HashSet<Money>(); 
		  set1.add(m1); 
		  set1.add(m2);
		  
		  Iterator<Money> itr = set1.iterator();
		  
		  while(itr.hasNext())
		  {
			  Money m = itr.next();
			System.out.println(m + ", " + m.hashCode());  
		  }
		 
		  /*
		   * H.W: same example with hashmap
		   * student object: roll no, name (roll no is unique)
		   * hashcode to be calculated on roll no
		   * add 5 student objects to the hashmap out of which  for 2 students with same info.
		   * 
		   * try diff combinations of override only hashcode, override only equals and dont override both
		   *
		   */
		  
		  
		  
		
	}

}
