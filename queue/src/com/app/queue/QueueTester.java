package com.app.queue;

public class QueueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new Queue<>(4);
		System.out.println(q.enQueue(100));
		System.out.println(q.enQueue(200));
		System.out.println(q.enQueue(300));
		System.out.println(q.enQueue(400));
		System.out.println(q.enQueue(500));
		System.out.println(q.enQueue(600));
		
		q.display();
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.enQueue(5000));
		
		q.display();
	}

}
