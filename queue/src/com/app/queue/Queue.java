package com.app.queue;

public class Queue<T> {
	private static int count =0;
	private int front;
	private int rear;
	private int size;
	private int arr[];
	public Queue(int size) {
		this.front=-1;
		this.rear=-1;
		this.size=size;
		arr= new int[size];
	}
	
	public boolean isFull() {
		//System.out.println("size: "+size+"  rear "+rear);
		if(rear==(size-1))
		return true;
		return false;
	}
	
	public boolean isEmpty()
	{
		if(front==-1 && rear==-1 ||front>rear)
		{
			return true;
		}
		return false;
	}
	
	public boolean enQueue(int data) {
		System.out.println("inside enque");
		 if(isFull()) {
	            return false;
	        }
	        arr[++rear] = data;
	        if(front == -1) {        	
	            front = 0;
	        }
	        return true;
	    }
		
	
					
	
	
	public int deQueue() {
		System.out.println("inside dequeue");
		if(isEmpty())
			return -989;
		//if(isFull() || rear<size-1) {
			return  arr[front++];
	}
	
	public void display() {
		System.out.println("inside display ");
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
			
	
		for(int i=0;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
