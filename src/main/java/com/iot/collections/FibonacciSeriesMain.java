package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		FibonacciSeries fibSeries = new FibonacciSeries();
		int indexNo = 4181;
		int value = 0;
		List<Integer> fiboSeries = new ArrayList<Integer>();
		
		fiboSeries = fibSeries.fibonacciSeries(2);
		System.out.println(fiboSeries);
		
		
		value = fibSeries.getIndexFiboSeries(fiboSeries, indexNo);
		  System.out.println(value);
		 
	}

}
