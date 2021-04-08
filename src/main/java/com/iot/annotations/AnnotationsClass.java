package com.iot.annotations;


/**
 *
 * @author gangineni
 *
 *Annotations are the labels for JVM or JDK.
 *
 *if the labels are created with compile time tag then they are for JDK 
 *
 *if the labels are created with run time tag then they are for JVM
 *
 *built-in java provided default annotations: override, suppress warnings and deprecated
 */

/*To suppress the warnings in a class, method we use "@SuppressWarnings" annotation
 * 
 * If we get any warnings from external third party libraries then to suppress those, we use "@SuppressWarnings" annotation
 */

@SuppressWarnings(value = { "all" })


public class AnnotationsClass {

	public static void main(String[] args) {
		
		BaseClass bc = new BaseClass();
		ChildClass cc = new ChildClass(5);
		
		bc.amDeprecated();
	}
	
}
