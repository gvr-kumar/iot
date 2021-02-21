package com.iot.linkedlist;


import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {
	
	private static LlHumanNode prvNode;
	private static LlHumanNode firstNode;
	
	/*private static List<LlHumanNode> linkdList = new ArrayList<LlHumanNode>();
	public static void prepareLinkedlist(LlHumanNode llObj)
	{
		if(linkdList.size() > 0 && prvNode != null)
		{
			prvNode.setFwdRef(llObj);
		}
		else
		{
			firstNode = llObj;
		}
		linkdList.add(llObj);
		prvNode = llObj;
		
	}*/
	
	public static void prepareLinkedlist(LlHumanNode llObj)
	{
		if(prvNode != null)
		{
			prvNode.setFwdRef(llObj);
		}
		else
		{
			firstNode = llObj;
		}
		prvNode = llObj;
	}
	
	  public static void printLinkdList() {
	  
		  LlHumanNode strtNode = firstNode;
			while(strtNode != null) {
				String name = null;
				if (strtNode != null) {
					name = strtNode.getFname();
					System.out.print(name);
					if (strtNode.getFwdRef() != null)
						System.out.print(" --> ");
					strtNode = strtNode.getFwdRef();

				}
			}
		}
	 
	 /* Add in the beginning
	  * Add in the middle
	  * Add in the last  
	  * 
	  * same way remove
	  * 
	  */
	 

}
