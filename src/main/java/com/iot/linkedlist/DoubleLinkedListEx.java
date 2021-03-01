package com.iot.linkedlist;

public class DoubleLinkedListEx {
	
	/**
	 * Linked List: In linked list each element contains its own value and the reference of the next element.
	 * 
	 * Single linked lists, double linked lists
	 * 
	 * Double linked lists (DLL) are most commonly used. <code>LinkedList</code> class implements double linked lists  
	 * 
	 * In Double linked list each element contains its own value and the reference of the previous element and also its next element.
	 * 
	 * Single linked lists (SLL):  data structures that use single linked lists are stack and queue
	 * 
	 * Stack: Last In First Out OR Last in First Out(Push & Pop operations)
	 * 
	 * Queue: First In First Out (Enqueue & Dequeue operations)
	 * 
	 * 
	 * 
	 * 
	 */
	
	private static LlHumanNode prvNode;
	private static LlHumanNode currNode;
	private static LlHumanNode firstNode;
	private static LlHumanNode lastNode;
	
	static int counter = 0;
	
	public static void prepareDblLinkedlist(LlHumanNode llObj)
	{
		//a b c
		if(prvNode != null)
		{
			prvNode.setFwdRef(llObj);
			currNode = llObj;
			currNode.setBwdRef(prvNode);
			counter++;
		}
		else
		{
			firstNode = llObj;
			counter++;
		}		
		prvNode = llObj;
		lastNode = llObj;
	}
	
	public static void addFirst(LlHumanNode llObj)
	{				
		LlHumanNode strtNode = llObj; 
				
		strtNode.setFwdRef(firstNode);		
		firstNode.setBwdRef(strtNode);		
		firstNode = llObj;
		counter++;
	}
	
	public static void addLast(LlHumanNode llObj)
	{		
		lastNode.setFwdRef(llObj);
		llObj.setBwdRef(lastNode);
		lastNode = llObj;		
		counter++;
		
		/*
		 * LlHumanNode strtNode = firstNode;
		 * 
		 * while(strtNode != null) { if (strtNode.getFwdRef() != null) { strtNode =
		 * strtNode.getFwdRef(); currNode = strtNode; } else {
		 * strtNode.setFwdRef(llObj); llObj.setBwdRef(currNode); lastNode = llObj;
		 * counter++; break; } }
		 */
	}
	
	public static void addMiddle(String prvName,String newName, String nxtName)
	{
		LlHumanNode nodeToConsider = null;
		LlHumanNode strtNode = firstNode;
		LlHumanNode previousNode = null;
		 
		while(strtNode != null)
		{
			if (strtNode.getFwdRef() != null && strtNode.getBwdRef() !=null)
			{
				String name = strtNode.getFname();
				 
				if (name.equalsIgnoreCase(nxtName) && strtNode.getBwdRef().getFname().equalsIgnoreCase(prvName))
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
			else
			{
				strtNode = strtNode.getFwdRef();					
			}	
		}
		previousNode = nodeToConsider.getBwdRef();		
		LlHumanNode hmid = new LlHumanNode(newName, "Chetan", "Gandhi Nagar");
		nodeToConsider.setBwdRef(hmid);
		hmid.setFwdRef(nodeToConsider);
		hmid.setBwdRef(previousNode);
		previousNode.setFwdRef(hmid);				
	}
	
	public static void deleteFirst()
	{
		LlHumanNode tempNode = firstNode.getFwdRef();
		firstNode = null;
		counter--;
		firstNode = tempNode;
	}
	
	public static void deleteMiddle(String prvName,String delName, String nxtName)
	{
		LlHumanNode nextNode = null;		
		LlHumanNode strtNode = firstNode;
		 boolean midFlag = false;
		 
		 while(strtNode != null)
			{
			 if (strtNode.getFwdRef() != null && strtNode.getBwdRef() !=null)
				{
					String name = strtNode.getFname();
					 
					if (name.equalsIgnoreCase(delName) && 
							strtNode.getBwdRef().getFname().equalsIgnoreCase(prvName) && 
							strtNode.getFwdRef().getFname().equalsIgnoreCase(nxtName))
					{
						nextNode = strtNode.getFwdRef();						
						prvNode.setFwdRef(nextNode);
						nextNode.setBwdRef(prvNode);
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
					strtNode = strtNode.getFwdRef();
					//break;
				}
		
	       }
		 if (!midFlag)
		 {
			 System.out.println(delName + " Not Found or Names are not in the correct order");
		 }
	}
	
	public static void deleteLast()
	{
		lastNode.getBwdRef().setFwdRef(null);		
		lastNode.setBwdRef(null);		
	    lastNode = null;    
	    counter--;
	    
		/*
		 * LlHumanNode strtNode = firstNode;
		 * 
		 * while(strtNode != null) { if (strtNode.getFwdRef() == null) {
		 * strtNode.setBwdRef(null); strtNode = null; prvNode.setFwdRef(null);
		 * counter--; } else { prvNode = strtNode; strtNode = strtNode.getFwdRef(); } }
		 */
		
	}
	
	 public static int printllCount()
	  {
		  //System.out.println("linked list count: "+ counter);
		  return counter;
	  }
	
	
	 public static void printLinkdList() {
		  
		  LlHumanNode strtNode = firstNode;
				  
			while(strtNode != null) {
				String name = null;
				if (strtNode != null) {
					name = strtNode.getFname();
					System.out.print(name);
					
					if (strtNode.getFwdRef() != null)
					{ 
					    if(strtNode.getFwdRef().getBwdRef() != null && strtNode.getFwdRef().getBwdRef() == strtNode)
					    {
					    	System.out.print(" <==> ");
					    }
					}
					strtNode = strtNode.getFwdRef();
				}
			}
		}
	  
}
