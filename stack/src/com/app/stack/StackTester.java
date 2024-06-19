package com.app.stack;

public class StackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1=new Stack<>(4);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.display();
		s1.pop();
		s1.display();
		s1.push(100);
		s1.peek();
		s1.display();

	}

}
