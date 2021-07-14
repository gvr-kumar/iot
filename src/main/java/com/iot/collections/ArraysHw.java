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
		try
		{
			if(arrRead == null || arrRead.length<=0)
			{
				System.out.println("array length is 0.");
			}
			else
			{
				for(int i=0; i<arrRead.length;i++)
				{
					System.out.println(arrRead[i]);
				}
			}
		}catch(Exception e)
		{			
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
	
	public int nthMax(int index, int[] intArr)
	{
		int nthMax = 0;
		try
		{
			if(index >= intArr.length)
			{
				System.out.println("Index is out of bounds.");
				
			}else if (index <= 0)
			{
				System.out.println("Index is not valid.");
			}
			else
			{
				for(int i = 0; i< intArr.length; i++)
				{
					if(index-1 == i)
					{
						nthMax = intArr[i];
					}
				}
			}
		}
		catch(Exception e) {}
		return nthMax;
	}
	
	public int[] sortArray(String sortOrder, int[] intArr)
	{
		try
		{
			for (int i = 0; i < intArr.length; i++) {
				for (int j = 0; j < intArr.length; j++) {
					int maxVal = 0;
					if(sortOrder.equalsIgnoreCase("ASCENDING"))
					{
						if (intArr[i] < intArr[j]) {
							maxVal = intArr[j];					
							intArr[j] = intArr[i];
							intArr[i] = maxVal;
						}
					}
					else if(sortOrder.equalsIgnoreCase("DESCENDING"))
					{
						if (intArr[i] > intArr[j]) {
							maxVal = intArr[j];					
							intArr[j] = intArr[i];
							intArr[i] = maxVal;
						}
					}
				}
			}
		}
		catch(Exception e) {}
		return intArr;
	}

}
