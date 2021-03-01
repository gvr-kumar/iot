package com.iot.linkedlist;




public class MyLinkedList {
	
	private static LlHumanNode prvNode;
	private static LlHumanNode firstNode;
	static int counter = 0;
	
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
			counter++;
		}
		else
		{
			firstNode = llObj;
			counter++;
		}
		prvNode = llObj;
		
	}
	
	public static void addFirst(LlHumanNode llObj)
	{				
		LlHumanNode strtNode = llObj; //h1 h2 h3
				
		strtNode.setFwdRef(firstNode);
		
		firstNode = llObj;
		counter++;
		
	}
	
	public static void addLast(LlHumanNode llObj)
	{
		 LlHumanNode strtNode = firstNode;
		 
		while(strtNode != null)
		{
			if (strtNode.getFwdRef() != null)
			{
				strtNode = strtNode.getFwdRef();
			}
			else
			{
				strtNode.setFwdRef(llObj);
				counter++;
				break;
			}
		}
		
	}
	
	public static void addMiddle(String existingName,String newName)
	{
		LlHumanNode nextNode = null;
		LlHumanNode nodeToConsider = null;
		 LlHumanNode strtNode = firstNode;
		 
		while(strtNode != null)
		{
			if (strtNode.getFwdRef() != null)
			{
				String name = strtNode.getFname();
				 
				if (name.equalsIgnoreCase(existingName))
				{
					nodeToConsider = strtNode;
					counter++;
					break;					
				}
				else
				{
					strtNode = strtNode.getFwdRef();					
				}				
			}			
		}
		nextNode = nodeToConsider.getFwdRef();
		LlHumanNode hmid = new LlHumanNode(newName, "Movva", "Los Angeles");
		nodeToConsider.setFwdRef(hmid);
		nodeToConsider = nodeToConsider.getFwdRef();
		hmid.setFwdRef(nextNode);
		
	}
	
	public static void deleteFirst()
	{
		LlHumanNode tempNode = firstNode.getFwdRef();
		firstNode = null;
		counter--;
		firstNode = tempNode;
	}
	
	public static void deleteMiddle(String existingName)
	{
		LlHumanNode nextNode = null;		
		LlHumanNode strtNode = firstNode;
		 boolean midFlag = false;
		 
		 while(strtNode != null)
			{
				if (strtNode.getFwdRef() != null)
				{
					String name = strtNode.getFname();
					 
					if (name.equalsIgnoreCase(existingName))
					{
						nextNode = strtNode.getFwdRef();						
						prvNode.setFwdRef(nextNode);
						strtNode = null;
						counter--;
						midFlag = true;
						break;					
					}
					else
					{
						prvNode = strtNode;
						strtNode = strtNode.getFwdRef();					
					}
										
				}
				else
				{
					break;
				}
		
	       }
		 if (!midFlag)
		 {
			 System.out.println(existingName + " Not Found");
		 }
	}
	
	public static void deleteLast()
	{
		LlHumanNode strtNode = firstNode;
		 
		while(strtNode != null)
		{
			if (strtNode.getFwdRef() == null)
			{				
				strtNode = null;
				prvNode.setFwdRef(null);
				counter--;
			}
			else
			{
				prvNode = strtNode;
				strtNode = strtNode.getFwdRef();					
			}
		}
		
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
	  
	  public static int printllCount()
	  {
		  //System.out.println("linked list count: "+ counter);
		  return counter;
	  }

	  
	  public static void printLinkedListCount()
	  {
		  int count = 0;
	  
		  LlHumanNode strtNode = firstNode;
			 
			while(strtNode != null)
			{
				count++;
			
				if (strtNode.getFwdRef() != null)
				{
					strtNode = strtNode.getFwdRef();
					
				}
				else
				{					
					break;
				}		  
	        }
			System.out.println("linked list count: "+ count);
	  }
}
	 
	 /* Add in the beginning
	  * Add in the middle
	  * Add in the last  
	  * 
	  * same way remove
	  * 
	  */
	 

	  

