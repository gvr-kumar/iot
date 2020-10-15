package com.iot.onlyoneobject;

  public class OnlyOneObjectClass {
		
	  /*
		 * private OnlyOneObjectClass() {
		 * 
		 * }
		 */
	 private static OnlyOneObjectClass obj1 = new OnlyOneObjectClass();

	  public static void onlyObjMethod() 
	  { 
		  System.out.println(obj1);
		  
	  }
	  
		/*
		 * public static void main(String[] args) {
		 * 
		 * OnlyOneObjectClass.onlyObjMethod(); OnlyOneObjectClass.onlyObjMethod(); }
		 */
	 	 
}

