package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	
	/***
	 * method to return fibonacci series using array list
	 * @param n
	 * @return
	 */

	public ArrayList<Integer> fibonacciSeries(int n) {

		List<Integer> fibSeries = new ArrayList<Integer>();

//Fibonacci formula: fn = fn-1 + fn-2: try with recursion; method with arraylist : all operations

		int a = 0;
		int b = 1;
		int sum1 = 0;
		try {
			if (n <= 0) {
				System.out.println("Please provide a valid value.");
			} else {
				fibSeries.add(a);

				if (n >= 2) {
					for (int i = 2; i <= n; i++) {
						if (i == 2) {
							sum1 = sum1 + b;
							fibSeries.add(sum1);
						} else {
							sum1 = fibSeries.get((i - 1) - 1) + fibSeries.get((i - 2) - 1);
							fibSeries.add(sum1);
						}
					}
				}
			}
		} catch (Exception e) {
		}

		return (ArrayList<Integer>) fibSeries; // doubt

	}

	/**
	 * Get index number based on the value passed
	 * 
	 * @param fiboSeries
	 * @param j
	 * @return
	 */

	public int getIndexFiboSeries(List<Integer> fiboSeries, int j) {
		int k = 0;

		try {
			if (fiboSeries.contains(j)) {
				for (int i = 0; i < fiboSeries.size(); i++) {
					if (fiboSeries.get(i) == j) {
						k = i;
					}
				}
			} else {
				System.out.println("Provide a valid value.");
			}
		} catch (Exception e) {
		}
		return k;
	}

	/***
	 * method to return fibonacci series
	 * @param n
	 * @return
	 */
	
	public void fiboSeries(int n) {
	
		
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
			  else if(n>=2)
			  {
				  System.out.println(a);
				  for (int i = 2; i <= n; i++)
				  {
					  if(i==2)
					  {
						  System.out.println(b);
					  }
					  else
					  {
						  c = a + b;
						  a=b;
						  b = c;
						  System.out.println(c);
					  }					 	
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
	
	public void getValFiboSeries(int n, int index) {

		int a = 0;
		int b = 1;
		int c = 0;
		try {
			if(index<=n)
			{
			  if (index <= 0) 
			  { 
				  System.out.println("Please provide a valid value."); 
			  } else if(index==1)
			  {
				  System.out.println(a);
			  }
			  else if(index>=2)
			  {
				  if(index==2 || index==3)
				  {
					  System.out.println(b);
				  }
				  else
				  {
					  //System.out.println(a);
					  for (int i = 2; i <= n; i++)
					  {
						  if(i==2)
						  {}
						  else
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
				  }
			  }
			}
			else
			{
				System.out.println("Provide a valid index.");
			}
		} catch (Exception e) {
		}
	}

}

