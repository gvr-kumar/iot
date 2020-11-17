package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class FibonacciExample {

	public static void main(String[] args) {
		
		int n = 7;
		//int index = 4;
		
		
		//int i;
		ArrayList<Integer> lisfib = new ArrayList<Integer>();	
		
		FibonacciSeries fib = new FibonacciSeries();
		
		System.out.println(fib.fibVal(n));
		
		//lisfib = fib.fibonacciSeries(n);
		
		//System.out.println(lisfib);
		
		//System.out.println(fib.getValFrmFib(index,lisfib));
	
	}

}
