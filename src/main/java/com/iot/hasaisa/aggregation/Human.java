package com.iot.hasaisa.aggregation;

public class Human {
	
	/*
	 * HasAClass3 has (composed of) HasAClass1 and HasAClass2 ('has a' relationship or Composition)
	 *
	 *Aggregation: here Human and Heart classes are dependent on each other
	 *
	 *Heart alone cannot live without a human (body); similarly lungs.
	 *
	 *and human cannot live without a heart
	 *
	 *
	 *Every aggregation is a composition but every composition need not be aggregation
	 */
	
	Lungs lungs = new Lungs();
	
	Heart heart = new Heart();
	
	
	
 
}
