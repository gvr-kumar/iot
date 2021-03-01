package com.iot.linkedlist;

public class LinkedListMain {
public static void main(String[] args) {
	
	LlHumanNode h1 = new LlHumanNode("Kishore", "Madina", "Hyderabad");
	LlHumanNode h2 = new LlHumanNode("Vasantha", "Kavuri", "Charlotte");
	LlHumanNode h3 = new LlHumanNode("Ravi", "Kumar", "Atlanta");
	LlHumanNode h0 = new LlHumanNode("John", "Doe", "Seattle");
	LlHumanNode h4 = new LlHumanNode("Shah", "Khan", "Dallas");
	LlHumanNode h5 = new LlHumanNode("Jaya", "Koneru", "Vijaywada");
	
	
	MyLinkedList.prepareLinkedlist(h1);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.prepareLinkedlist(h2);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.prepareLinkedlist(h3);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.addFirst(h0);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.addLast(h4);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.addLast(h5);
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.addMiddle("Vasantha", "Deepthi");
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.deleteFirst();
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.deleteLast();
	System.out.println(MyLinkedList.printllCount());
	MyLinkedList.deleteMiddle("Lakshmi");
	System.out.println(MyLinkedList.printllCount());
	
	MyLinkedList.printLinkdList();
	
	
	}
}

