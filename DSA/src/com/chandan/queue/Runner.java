package com.chandan.queue;

public class Runner {

	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		queue.enQueue(10);
		System.out.println(queue.deQueue());	
		queue.show();

	}

}
