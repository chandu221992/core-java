package com.chandan.tree;

public class BinaryTree {

	private Node rootNode;

	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}

	public void insert(int data) {

		rootNode = insertRec(rootNode, data);
	}

	private Node insertRec(Node rootNode, int data) {
		if (rootNode == null) {
			rootNode = new Node();
			rootNode.setData(data);
		} else if (rootNode.getData() < data) {
			rootNode.setRightNode(insertRec(rootNode.getRightNode(), data));
		} else {
			rootNode.setLeftNode(insertRec(rootNode.getLeftNode(), data));
		}
		return rootNode;
	}

	public void inOrder() {
		inOrderRec(rootNode);
		System.out.println();
	}

	private void inOrderRec(Node rootNode) {
		if (rootNode != null) {
			inOrderRec(rootNode.getLeftNode());
			System.out.print(rootNode.getData() + " ");
			inOrderRec(rootNode.getRightNode());
		}
	}
	public void preOrder() {
		preOrderRec(rootNode);
	}

	private void preOrderRec(Node rootNode) {
		if (rootNode != null) {
			System.out.print(rootNode.getData() + " ");
			inOrderRec(rootNode.getLeftNode());
			inOrderRec(rootNode.getRightNode());
		}
	}
}
