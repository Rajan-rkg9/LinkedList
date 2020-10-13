package com.DataStructure.LinkedList;

public class Node<T>  implements INode<T> {
	T data;
	Node<T> next;
	
	public Node( T data) {
		super();
		this.data = data;
		this.next = null;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	} 
	public void setNext(INode<T> next) {
		this.next = (Node<T>)next;
	}
	public T getData() {
		return data;
	}	
}