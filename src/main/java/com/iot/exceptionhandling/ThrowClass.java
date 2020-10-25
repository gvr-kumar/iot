package com.iot.exceptionhandling;

public class ThrowClass {
	/*
	 * Throw keyword: when throw is used explicitly, we should use throws with same exception or its parent exception in the method signature 
	 * 
	 * multiple exceptions can be thrown using throws in the method signature but multiple inheritance is not possible
	 */
	
	public void useThrow(int[] intArrLst) throws CustomException, CustomException2  {
		for(int i=0; i< intArrLst.length;i++)
		{
			if(intArrLst[i]>=10)
			{
				System.out.println(intArrLst[i]);
			}
			else if(intArrLst[i]>5 && intArrLst[i]<10)
			{
				throw new CustomException2("Custom exception2 using throw when i > 5 & i<10");
			}			
			else
			{
				throw new CustomException("Custom exception using throw when i < 5");
			}
		}
		
	}

}
