package com.iot.collections;

public class NthHigheshtArrays {
	public static void main(String args[])
	{
		int[] intArr= {10,3,5,6,72,2,99,101,1,72,101};
		int nMax = 3;	
		ArraysHw arrHw = new ArraysHw();
		arrHw.sortArray("DESCENDING", intArr);
		
		for (int i = 0; i < intArr.length; i++) {
			
			System.out.println(intArr[i]);
		}
		
		System.out.println("nth max number is " + arrHw.nthMax(nMax, intArr));
		
	}

}

 

//72 3 5 6 10 2 99 101 1