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
	private static LlHumanNode nxtNode;
	private static LlHumanNode firstNode;
	
	public static void prepareDblLinkdList(LlHumanNode llObj) {
		if (prvNode != null) {
			prvNode.setFwdRef(llObj);
		} else {
			firstNode = llObj;
		}
		prvNode = llObj;
	}
	
	
	

}
