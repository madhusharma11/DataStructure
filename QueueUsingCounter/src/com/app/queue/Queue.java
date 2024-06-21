package com.app.queue;

public class Queue {
	private static int count = 0;
	private int size;
	private int[] arr;

	public Queue(int size) {
		this.size = size;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}

	public boolean esFull() {
		if (count == size)
			return true;
		return false;
	}

	public boolean enQueue(int data) {
		System.out.println("inside enque");
		if (isEmpty()) {
			arr[count++] = data;
			// System.out.println("arr[count]");
			return true;
		}
		arr[count++] = data;
		// front=rear;
		return true;

	}

	public boolean deQueue() {
		if (isEmpty())
			return false;
		count--;
		return true;
	}

	public void display() {
		System.out.println("inside display ");
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
