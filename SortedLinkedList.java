package com.DataStructure.LinkedList;

public class SortedLinkedList<T extends Comparable<T>> {
	INode<T> head;
	INode<T> tail;
	int size;
	public SortedLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	public int size() {
		return size;
	}
	public void insertSortedList(INode<T> newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null) {
			this.tail = newNode;
			size++;
		}
		else if(this.head==this.tail) 
		{
			if(newNode.getData().compareTo(this.head.getData())>0) {
				append(newNode);
			}else
			{
				INode<T> current = this.head;
				this.head = newNode;
				this.head.setNext(current);
				size++;
			}
		}
		else if(newNode.getData().compareTo(this.head.getData())<0) {
			INode<T> current = this.head;
			this.head = newNode;
			this.head.setNext(current);
			size++;
		}
		else {
			INode<T> current = this.head;
			while(current != this.tail && newNode.getData().compareTo(current.getNext().getData())>0) 
			{
				current=current.getNext();
			}
			insertAfter(current, newNode);
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
	public void remove(T input) {
		INode<T> current = this.head;
		if (current == this.tail && current != null) {
			if (current.getData() == input) 
			{
				this.head = null;
				this.tail = null;
			}
		} 
		else if (current != null) {
			while (current != this.tail && !(current.getNext().getData() == input)) {
				current = current.getNext();
			}
			if (current != this.tail) {
				INode<T> deletedElement = current.getNext();
				current.setNext(deletedElement.getNext());
				deletedElement.setNext(null);
				if (deletedElement == this.tail) {
					this.tail = current;
				}
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
		SortedLinkedList<Integer> list = new SortedLinkedList<>();
		Node<Integer> newNode1 = new Node<>(56);
		Node<Integer> newNode2 = new Node<>(30);
		Node<Integer> newNode3 = new Node<>(70);
		Node<Integer> newNode4 = new Node<>(40);
		list.insertSortedList(newNode1);
		list.insertSortedList(newNode2);
		list.insertSortedList(newNode3);
		list.insertSortedList(newNode4);
		list.display();
		
	}
	
}
