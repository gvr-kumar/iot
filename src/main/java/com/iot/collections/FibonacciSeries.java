package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	
	public ArrayList fibonacciSeries (int n){
		
		//parent class reference can be assigned to child class object
		
		List<Integer> lisfib = new ArrayList<Integer>();	
		//ArrayList<Integer> lisfib = new ArrayList<Integer>(); 
		
		int x = 0;
		int y = 1;
		
		int counter = 0;
		
		while (counter<n)
				{
			lisfib.add(x);
		
			int z = x + y;
		  
		     x = y;
		     y = z; 
		  
		  counter = counter + 1;
		  
		}	  
		 return (ArrayList) lisfib;
	}

	
	public int fibVal(int n)
	{
		int a = 0;
		int b = 1;
		
		if(n==0)
			return a;
		
		for(int i = 2; i <= n; i++) {
			
			int c = a + b;
			
			a = b;
			b = c;
		}
		return b;
	}
	
	public int getValFrmFib(int n, ArrayList<Integer> fibList) {
		int fibVal = 0;
		
		try {		
		
		if (n <= 0)
		{
		System.out.println("check the index value");
		}
		else if (n>=fibList.size())
		{
			System.out.println("Index value is out of bounds");
		}
		else
		{
			for(int i = 0; i<fibList.size(); i++) {
				
				if (i==n) {
					fibVal = fibList.get(n);
				}
			}
		}
		}catch(Exception e) {}
		
		return fibVal;
	}	
}
		 


	
