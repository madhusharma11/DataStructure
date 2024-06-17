package com.datastructureday1;

public class MainTester {
	public static void main(String[] args)
	{
		System.out.println("hello");
		LinkedList newList=new LinkedList();
		newList.insert(8);
		newList.insert(1);
		newList.insert(2);
		newList.insert(5);
		newList.insert(7);
		newList.insert(4);
		newList.display();
		System.out.println("maximum number is: "+ newList.findMaxNumber());
		System.out.println("Minimum number is: "+ newList.findMinNumber());
		System.out.println("Sum of even number is: "+ newList.sumOfAllEvenNumber());
		
	}

}
