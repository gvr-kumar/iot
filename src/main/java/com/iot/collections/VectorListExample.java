package com.iot.collections;

import java.util.Vector;

public class VectorListExample {
	
	public static void main(String[] args) {
		
		/*
		 * Vector: Vectors are similar to arraylists. Only difference between vectors and arraylists is 
		 * 
		 * Vectors are synchronized (thread safe) where arraylists are not synchronized (not thread safe).
		 * 
		 */
		
		
		Vector<Integer> vec1 = new Vector<Integer>();
		
		for(int i=0;i<args.length;i++)
		{
			vec1.add(Integer.parseInt(args[i]));
		}
		
		System.out.println(vec1);
	}

}
