package com.DataStructure.LinkedList;

public class Node<T>  {
	T data;
	Node next;
	
	public Node( T data) {
		super();
		this.data = data;
		this.next = null;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}	
	
}
