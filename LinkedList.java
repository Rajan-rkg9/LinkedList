package com.DataStructure.LinkedList;

public class LinkedList<T> {
	INode<T> head;
	INode<T> tail;
	int length = 0;
	
	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}
	
	public void insert(INode<T> newNode)
	{
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else
		{
			 INode<T> current = head;
			 head = newNode;
			 head.setNext(current);
		}
		length++;
	}
	public  void display()
	{
		INode<T> current = this.head;
		if(current != null) {
		System.out.print(current.getData());
		while((current =current.getNext()) != null)
		{
			System.out.print("->" + current.getData());
		}
		}
	}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Node<Integer> newNode1 = new Node<>(70);
		Node<Integer> newNode2 = new Node<>(30);
		Node<Integer> newNode3 = new Node<>(56);
		list.insert(newNode1);
		list.insert(newNode2);
		list.insert(newNode3);
		list.display();
	}
}
