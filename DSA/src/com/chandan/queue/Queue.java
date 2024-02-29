package com.chandan.queue;

public class Queue {
	private int front;
	private int  rear;
	private int capacity=10;
	private int[] queue=new int[capacity]; 
	
	
	public void enQueue(int data) {
		queue[rear%capacity]=data;
		rear++;
		rear%=capacity;
	}
	public int deQueue() {
		int data=queue[front];
		front++;
		front%=capacity;
		return data;
	}
	
	public void show() {
		for(int i=0;i<queue.length;i++) {
			System.out.print(queue[i+front] +" ");
		}
		System.out.println();
	}

}
