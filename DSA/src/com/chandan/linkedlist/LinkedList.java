package com.chandan.linkedlist;

public class LinkedList<T> {

	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void insert(T data) {

		Node<T> node = new Node<>();
		node.setData(data);

		if (head == null) {
			head = node;
		} else {
			Node<T> n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}

	public void show() {
		Node<T> n = head;
		while (n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}

	public void insertAtStart(T data) {
		Node<T> node = new Node<>();
		node.setData(data);
		node.setNext(head);
		head = node;
	}

	public void insertAt(int index, T data) {
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node<T> node = new Node<>();
			node.setData(data);
			Node<T> n = head;

			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
	}

	public void deleteAt(int index) {

		if (index == 0) {
			head = head.getNext();
		} else {
			Node<T> n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.getNext();
			}
			Node<T> n1 = n.getNext();
			n.setNext(n1.getNext());
			n1 = null;

		}
	}
}
