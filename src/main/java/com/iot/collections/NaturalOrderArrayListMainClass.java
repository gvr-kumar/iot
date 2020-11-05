package com.iot.collections;

import java.util.ArrayList;
import java.util.List;

public class NaturalOrderArrayListMainClass {
	
	public static void main(String[] args) {
		
		try
		{
		
			ArraysHw arrHw = new ArraysHw();
			
			/*
			 * Collection size is not mentioned, its dynamic in size and memory allocation. 
			 * Where as in arrays, we need to specify the size of an array.
			 * 
			 * Load factor: if the load reaches 75% then size will be increased (doubled) dynamically by the JDK (collections class)
			 *
			 *Collections are dynamic and autogrowable.
			 *
			 *
			 */
			
			int[] intArr1 = new int[10];
			
			//int[] intArr2 = new int[20];
			
			List<Integer> arrList = new ArrayList<Integer>();
			
			//System.out.println(args.length);
			for(int i=0; i< args.length;i++)
			{
				arrList.add(Integer.parseInt(args[i]));
				//System.out.println(args[i]);
			}
			arrList.add(3, 999);
			
			for(int i=0;i<arrList.size();i++)
			{
				System.out.println(arrList.get(i));
			}
			
			//H.W : create an array with size 10 and add elements to it, once length reaches 7 then create another array of size 20 
			//and copy all elements of first array to second array and add more elements and then nullify the first array.
			
			int x=10;
			int[] a = new int[x];
			int[] b = null;
			
			float c = a.length*75/100;
			
			System.out.println("c value is : " + c);
			
			//System.out.println("Length of array a: " + a.length);
			
			for(int i=0;i<a.length;i++)
			{			
				if(i>=c)
				{
					b = new int[2*x];
					break;
				}
				else
				{
					a[i] = i+1;
				}
			}
			
			for(int j=0;j<c;j++)
			{
				b[j] = a[j]; 
			}
			
			for(int k=(int) c;k<b.length;k++)
			{
				b[k] = k+1;
			}
			System.out.println("First Array: a");
			
			arrHw.readArray(a);
			
			System.out.println("Second Array: b");
			
			arrHw.readArray(b);
			
			a=null;
			
			arrHw.readArray(a);
			
		}catch(Exception e)
		{}

	}
	
	
	
	

}
