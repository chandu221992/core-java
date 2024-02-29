package com.chandan.stack;

public class Stack {

	private int top;
	private int capacity = 10;
	private int stack[] = new int[capacity];

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public void push(int data) {

		if (size() >= capacity / 2) {
			expand();
		}

		stack[top] = data;
		top++;

	}

	public int pop() {
		if ((size()-1) <= capacity / 4) {
			shrink();
		}
		top--;
		int data = stack[top];
		stack[top] = 0;
		return data;
	}

	private void shrink() {
		capacity = capacity / 2;
		copyArray(capacity);
	}

	private void copyArray(int capacity) {
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
	}

	private void expand() {
		capacity *= 2;
		copyArray(capacity);
	}

	public int size() {
		return top;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
