package com.app.queue;

public class QueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.display();
		System.out.println("\nafter deletion:");
		q.deQueue();
		q.deQueue();
		q.display();
		
	}

}
