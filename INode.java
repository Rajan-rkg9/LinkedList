package com.DataStructure.LinkedList;

public interface INode<T extends Comparable<T>> {
	T getData();
	void setData(T data);
	
	INode<T> getNext();
	void setNext(INode<T> next);
}
