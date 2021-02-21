package com.iot.linkedlist;

public class LinkedListMain {
public static void main(String[] args) {
	
	LlHumanNode h1 = new LlHumanNode("Kishore", "Madina", "Hyderabad");
	LlHumanNode h2 = new LlHumanNode("Vasantha", "Kavuri", "Charlotte");
	LlHumanNode h3 = new LlHumanNode("Ravi", "Kumar", "Atlanta");
	
	MyLinkedList.prepareLinkedlist(h1);
	MyLinkedList.prepareLinkedlist(h2);
	MyLinkedList.prepareLinkedlist(h3);
	
	MyLinkedList.printLinkdList();
	
	}
}

