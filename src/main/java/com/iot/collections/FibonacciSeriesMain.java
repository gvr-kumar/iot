package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		FibonacciSeries fibSeries = new FibonacciSeries();
		int indexNo = 5;
		int value = 4181;
		List<Integer> fiboSeries = new ArrayList<Integer>();
		
	//fiboSeries = fibSeries.fibonacciSeries(20);
	//System.out.println(fiboSeries);
		
		fiboSeries(20);
		
		getValFiboSeries(10);
		
		
		//value = fibSeries.getIndexFiboSeries(fiboSeries, indexNo);
		//System.out.println(value);
		 
	}
	public static  void fiboSeries(int n) {
		
		
		//Fibonacci formula: fn = fn-1 + fn-2: try with recursion; method with arraylist : all operations
			
		//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]
		
			int a = 0;
			int b = 1;
			int c = 0;
			try {
				
				  if (n <= 0) 
				  { 
					  System.out.println("Please provide a valid value."); 
				  } else if(n==1)
				  {
					  System.out.println(a);
				  }
				  else if(n==2)
				  {
					  System.out.println(a);
					  System.out.println(b);
				  }
				  else if(n>2)
				  {
					  System.out.println(a);
					  System.out.println(b);
					  for (int i = 3; i <= n; i++)
					  {
						  c = a + b;
						  a=b;
						  b = c;
						  System.out.println(c);
					  }
				  }
			} catch (Exception e) {
			}
		}
		

	/***
	 * method to return value at a particular index in fibonacci series
	 * @param n
	 * @return
	 */
	
	public static void getValFiboSeries(int index) {

		int a = 0;
		int b = 1;
		int c = 0;
		try {
			  if (index <= 0) 
			  { 
				  System.out.println("Please provide a valid value."); 
			  } else if(index==1)
			  {
				  System.out.println(a);
			  }
			  else if(index==2 || index==3)
			  {
				  System.out.println(b);
			  }
			  else
			  {
				  a=1;
				  b=1;
				  //System.out.println(a);
				  for (int i = 4; i <= index; i++)
				  {
					  
						  c = a + b;
						  a=b;
						  b = c;
						  if(index == i)
						  {
							  System.out.println(c);
							  break;
						  }
					  				 	
				  }
			  }
			  
		} catch (Exception e) {
		}
	}

}
