package com.app.queue;

public class Queue {
	private static int count = 0;
	private QueueNode rear;
	private QueueNode front;

	public Queue() {
		rear = null;
		front = null;
	}

	public boolean isEmpty() {
		if (rear == null && front == null)
			return true;
		return false;
	}

	public boolean enQueue(int data) {
		System.out.println("inside enque");
		QueueNode newnode = new QueueNode(data);
		if (isEmpty()) {
			rear = newnode;// new QueueNode(data);
			front = rear;
			System.out.println("front: " + front.getData() + "newnode " + rear.getData());
			return true;
		}
		newnode.setNext(rear);
		rear.setPrev(newnode);
		rear = newnode;
		// front=rear;
		System.out.println("front: " + front.getData() + "newnode " + rear.getData());
		return true;

	}

	public boolean deQueue() {
		if(isEmpty())
			return false;
		if(front==rear)
		{
			front=null;
			rear=null;
		}
		
		QueueNode temp=front;
		QueueNode prev=front.getPrev();
//		while(temp.getNext()!=null) {
//			temp=temp.getNext();
//		}
		prev.setNext(null);
		front=prev;
		
		System.out.println("temp "+temp.getData());
		temp.setNext(null);
		
		return true;
	}

	public void display() {
		System.out.println("inside display ");
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		QueueNode temp = rear;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}
}
