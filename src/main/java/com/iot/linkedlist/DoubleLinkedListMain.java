package com.iot.linkedlist;

public class DoubleLinkedListMain {
public static void main(String[] args) {
	
	LlHumanNode h1 = new LlHumanNode("Chris", "Town", "NJ");
	LlHumanNode h2 = new LlHumanNode("Karen", "White", "LA");
	LlHumanNode h3 = new LlHumanNode("Darren", "Long", "FL");
	LlHumanNode h4 = new LlHumanNode("Leslie", "William", "TX");
	LlHumanNode h5 = new LlHumanNode("Peter", "Harris", "IL");
	
	DoubleLinkedListEx.prepareDblLinkedlist(h1);
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.prepareDblLinkedlist(h2);
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.prepareDblLinkedlist(h3);
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.addFirst(h4);
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.addLast(h5);
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.addMiddle("Karen","Alice","Darren");
	System.out.println(DoubleLinkedListEx.printllCount());
	
	DoubleLinkedListEx.displBreadCrumb("Peter");
	System.out.println();
	
	
	  DoubleLinkedListEx.deleteFirst();
	  System.out.println(DoubleLinkedListEx.printllCount());
	  
	
		  DoubleLinkedListEx.deleteLast();
		  System.out.println(DoubleLinkedListEx.printllCount());
		 
		  DoubleLinkedListEx.deleteMiddle("Karen","Alice","Darren");
		  System.out.println(DoubleLinkedListEx.printllCount());
		 
	 
	 
	DoubleLinkedListEx.printLinkdList();
	
	DoubleLinkedListEx.displBreadCrumb("Chris");
	
	}
}

