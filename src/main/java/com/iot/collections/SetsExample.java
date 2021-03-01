package com.iot.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {
		
		/*
		 * Sets does not allow duplicates like List (array list)
		 * 
		 * HashSet is backed with Hashmap (where keys are the values in the hashset, values of each key in hashmap are dummy values)
		 * 
		 * Hash Sets does not follow any order like arraylist and 
		 * 
		 * Tree set does not allow duplicates and sorts elements in ascending order
		 * 
		 * HW: add student objects to tree set 
		 * 
		 * TreeSet<String> tree_set = new TreeSet<String>(new 
        	The_Comparator());
		*/
		
		//10 20 30 40 50 60 70 80 10 90
		
		List<Integer> arrLstEx = new ArrayList<Integer>();
		
		Set<Integer> setEx = new HashSet<Integer>();
		
		Set<Integer> treeSetEx1 = new TreeSet<Integer>();
		Set<Integer> treeSetEx2 = new TreeSet<Integer>();
		
		
		
		
		for(int i=0;i< args.length;i++)
		{
			arrLstEx.add(Integer.parseInt(args[i]));
			setEx.add(Integer.parseInt(args[i]));
		}
		
		//adding all elements of hashset to treeset
		treeSetEx1.addAll(setEx);
		
		//adding all elements of arraylist  to treeset
		treeSetEx2.addAll(arrLstEx);
		
		System.out.println("ArrayList: " + arrLstEx);
		
		Collections.sort(arrLstEx);
		System.out.println("ArrayList after sorting: "+ arrLstEx);
		
		System.out.println("Hash Set Example: " + setEx);
		System.out.println("Copying hashset to Tree Set Example: " + treeSetEx1);
		System.out.println("Copying arraylist to Tree Set Example: " + treeSetEx2);
		
		//adding all elements of arraylist to treeset
		arrLstEx.addAll(treeSetEx2);
		arrLstEx.addAll(treeSetEx2);
		
		System.out.println("Copying Tree Set to arraylist Example: " + arrLstEx);
		
		//adding all elements of arraylist to setEx
		setEx.addAll(arrLstEx);
		
		//adding all elements of arraylist  to treeset
		treeSetEx2.addAll(arrLstEx);
		
		System.out.println("Copying arraylist with duplicates to hash Set Example: " + setEx);
		System.out.println("Copying arraylist with duplicates to Tree Set Example: " + treeSetEx2);
	}

}
