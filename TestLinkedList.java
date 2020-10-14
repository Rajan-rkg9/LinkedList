package com.DataStructure.LinkedList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void givenSearchValue_WhenInList_ShouldReturnTrue() {
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		Node<Integer> node1 = new Node<Integer>(56);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(70);
		list.insertSortedList(node1);
		list.insertSortedList(node2);
		list.insertSortedList(node3);
		list.display();
		boolean result = list.searchElement(30);
		assertTrue(result);
	}

	@Test
	public void givenSearchValue_WhenNotInList_ShouldReturnFalse() {
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		Node<Integer> node1 = new Node<Integer>(56);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(70);
		list.insertSortedList(node1);
		list.insertSortedList(node2);
		list.insertSortedList(node3);
		list.display();
		boolean result = list.searchElement(40);
		assertFalse(result);
	}
	
	@Test
	public void givenNumbers_WhenRemovingOne_ShouldPassLinkedListTest() {
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		Node<Integer> node1 = new Node<Integer>(56);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(70);
		Node<Integer> node4 = new Node<Integer>(40);
		list.insertSortedList(node1);
		list.insertSortedList(node2);
		list.insertSortedList(node3);
		list.insertSortedList(node4);
		
		System.out.println("Before deletion: ");
		list.display();
		int originalSize=list.size();
		list.remove(50);
		int modifiedSize=list.size();
		System.out.println("After deletion: ");
		list.display();
		
		boolean result = modifiedSize==originalSize;
		assertTrue(result);
	}
	
	@Test
	public void givenNumbers_WhenUsingSorted_ShouldBeAddedInSortedManner() {
		SortedLinkedList<Integer> list = new SortedLinkedList<Integer>();
		Node<Integer> node1 = new Node<Integer>(56);
		Node<Integer> node2 = new Node<Integer>(30);
		Node<Integer> node3 = new Node<Integer>(70);
		Node<Integer> node4 = new Node<Integer>(40);
		list.insertSortedList(node1);
		list.insertSortedList(node2);
		list.insertSortedList(node3);
		list.insertSortedList(node3);
		list.display();
		Node<Integer> node=(Node<Integer>) list.head;
		boolean result= node==node2;
		node=node.getNext();
		result=result && node==node4;
		node=node.getNext();
		result=result && node==node1;
		node=node.getNext();
		result=result && node==node3;
		assertTrue(result);
		
	}
}

