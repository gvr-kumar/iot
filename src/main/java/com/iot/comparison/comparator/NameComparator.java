package com.iot.comparison.comparator;

import java.util.Comparator;

import com.iot.oops.Human;

/**
 * 
 * @author gangineni
 *
 */

public class NameComparator implements Comparator<Human>{
	
	
	
	
	/*Name Comparator
	 * 
	 */
	
	public int compare(Human o1, Human o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
