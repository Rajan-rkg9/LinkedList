package com.DataStructure.LinkedList;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	public void given3NumbersWhenLinked_ShouldReturnTrue()
	{
		Node<Integer> newNode1 = new Node<>(56);
		Node<Integer> newNode2 = new Node<>(30);
		Node<Integer> newNode3 = new Node<>(70);
		newNode1.setNext(newNode2);
		newNode2.setNext(newNode3);
		boolean result = newNode1.getNext().equals(newNode2) && newNode2.getNext().equals(newNode3);
		assertTrue(result);
	}

}
