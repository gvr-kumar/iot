package com.iot.collections;

public class ArraysHw {
	
	int[] simplArr = new int[5];
	
	
	public int[] createArray()
	{
		for(int i=0; i<simplArr.length;i++)
		{
			simplArr[i] = i+1;
		}
		return simplArr;
	}
	
	public int[] updateArray(int index, int value, int[] arrUpdt)
	{
		try {
		for(int i=0; i<arrUpdt.length;i++)
		{
			if(i == index)
			{
				arrUpdt[i] = value;
				break;
			}			
		}
		}catch(Exception e)
		{}
		return arrUpdt;
	}
	
	public void readArray(int[] arrRead)
	{
		for(int i=0; i<arrRead.length;i++)
		{
			System.out.println(arrRead[i]);
		}
	}
	
	public int[] removElementFrmArr(int index, int[] arrRem)
	{
		int[] finalArr = new int[arrRem.length-1];
		
		for(int i=0, j=0; i<arrRem.length;i++)
		{
			if(index == i)
			{
				continue;
			}
			finalArr[j++] = arrRem[i];
		}
		return finalArr;
		
	}
	
	

}
