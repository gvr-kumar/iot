package com.iot.phoenix.training;

public class ArrayCrudExample {


	public static int[] createarray() {
		
		return new int[] {1,2,3,4,5,6,7,8,9,10};  
			
	}

	public void readArray()
	{
		int intArray[] = createarray();
		
		for (int i=0; i<intArray.length; i++)
		
		  System.out.println("Value at index " + i + " : " + intArray[i]);
				
	}
	
	public void addElementToArray(){
		
      int intArray[] = createarray();
		
		for (int j=0; j<intArray.length; j++)
			
			if(j==2)
			{
				intArray[j] = 1123;
				//System.out.println("Value at index " + j + " : " + intArray[j]);
		     }
		 for (int j=0; j<intArray.length; j++)
		 System.out.println("Value at index " + j + " : " + intArray[j]);
	}
	
	public void removeElement() {
		
		int intArray[] = createarray();
					
		int anotherArray[] = new int[intArray.length - 1];
		
		for (int i = 0, k = 0; i < intArray.length; i++) {
			if (i == 2) {
				continue;
				
			}
	    anotherArray[k++] = intArray[i];	
						
	}	
		for (int k = 0; k < anotherArray.length; k++) 
		System.out.println("Value at index " + k + " : " + anotherArray[k]);
		
}
}
