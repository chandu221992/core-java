package com.chandan.tree;

public class Runner {

	public static void main(String[] args) {
		BinaryTree tree=new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(9);
		tree.insert(2);
		tree.inOrder();
		tree.preOrder();

	}

}
