package com.iot.collections;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] multiDimArr1 = new int[2][3];
		
		multiDimArr1[0][0]= 1;
		multiDimArr1[0][1]= 2;
		multiDimArr1[0][2]= 3;
		multiDimArr1[1][0]= 4;
		multiDimArr1[1][1]= 5;
		multiDimArr1[1][2]= 6;
		
		System.out.println(multiDimArr1.length);
		
		for(int i=0;i<multiDimArr1.length;i++)
		{
			for(int j=0;j<multiDimArr1.length;j++)
			{
				System.out.println(multiDimArr1[i][j]);
			}
		}
	}

}
