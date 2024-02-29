package com.chandan.stack;

public class Runner {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(1);
		stack.show();
		stack.push(2);
		stack.show();
		stack.push(3);
		stack.show();
		stack.push(4);
		stack.show();
		stack.push(5);
		stack.show();
		stack.push(6);
		stack.show();
		stack.push(7);
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.pop());
		stack.show();
		System.out.println(stack.size());

	}

}
