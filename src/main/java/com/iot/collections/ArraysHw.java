package com.iot.collections;

public class ArraysHw {
	
	int[] simplArr = new int[10];
	
	
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
		int[] arrFinal = new int[arrRem.length];
		
		try {
			if(index>arrRem.length || index <0 )
			{
				System.out.println("Index is out of bounds, please send a valid index and Array remains the same.");
				arrFinal = arrRem;
			}
			else 
			{
				for(int i=0; i<arrRem.length;i++)
				{
					
						if(i < index)
						{
							arrFinal[i] = arrRem[i];
						}
						else if(i >= index)
						{
							arrFinal[i] = arrRem[i+1];
						}
				}
			}
		}catch(Exception e)
		{}
		
		return arrFinal;
		
	}
	
	

}
