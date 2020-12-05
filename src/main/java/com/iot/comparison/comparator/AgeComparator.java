package com.iot.comparison.comparator;

import java.util.Comparator;

import com.iot.oops.Human;

/**
 * 
 * @author gangineni
 *
 */

public class AgeComparator implements Comparator<Human>{
	
	
	
	
	/*Age Comparator
	 * 
	 */
	
	public int compare(Human o1, Human o2) {
		
		if(o1.getAge() > o2.getAge())
		{
			return 1;
		}
		else if(o1.getAge() < o2.getAge())
		{
			return -1;
		}
		else
		{
			return 0;
		}			
	}

}
