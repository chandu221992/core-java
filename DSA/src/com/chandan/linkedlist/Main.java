package com.chandan.linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insertAt(4, 5);
		list.deleteAt(1);
		
		list.show();

	}

}
