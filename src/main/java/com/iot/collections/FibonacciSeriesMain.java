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
		
		fibSeries.fiboSeries(4);
		
		
		//value = fibSeries.getIndexFiboSeries(fiboSeries, indexNo);
		//System.out.println(value);
		 
	}

}
