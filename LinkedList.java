package com.DataStructure.LinkedList;

public class LinkedList<T> {
	INode<T> head;
	INode<T> tail;
	
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
	}
	public void append(INode<T> newNode)
	{
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else
		{
			this.tail.setNext(newNode);
			this.tail = this.tail.getNext();
		}
	}
	public void insertAfter(INode<T> newNode1 , INode<T> newNode2)
	{
		INode<T> current = newNode1.getNext();
		newNode1.setNext(newNode2);
		newNode2.setNext(current);
	}
	public INode<T> popFirstElement()
	{
		INode<T> current = this.head;
		this.head = current.getNext();
		return current;
	}
	public INode<T> popLastElement()
	{
		INode<T> prev = null;
		INode<T> current = this.head;
		while(current.getNext() != null)
		{
			prev = current;
			current = current.getNext();
		}
		prev.setNext(current.getNext());
		return current;
	}
	public boolean searchElement(T key)
	{
		INode<T> current = this.head;
		while(current != null)
		{
			if(current.getData() == key)
				return true;
			current = current.getNext();
		}
		return false;
	}
	public void insertAfterAnElement(T input , INode<T> newNode)
	{
		INode<T> current = this.head;
		while(current != null)
		{
			if(current.getData() == input)
				break;
			else
			{
				INode<T> temp = current.getNext();
				current.setNext(newNode);
				current.getNext().setNext(temp);
				if(current == this.tail)
					this.tail = newNode;
			}							
		}
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
		Node<Integer> newNode1 = new Node<>(56);
		Node<Integer> newNode2 = new Node<>(30);
		Node<Integer> newNode3 = new Node<>(70);
		list.append(newNode1);
		list.append(newNode3);
		list.insertAfterAnElement(56, newNode2);
		list.display();
		
	}
}
