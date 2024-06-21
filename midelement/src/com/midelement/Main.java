package com.midelement;

public class Main {
	
	
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		l1.insert(10);
		l1.insert(20);
		l1.insert(10);
		l1.insert(40);
		l1.insert(50);
		l1.insert(40);
		l1.insert(50);
		l1.display();
		
		//ques 2: third last element
		l1.findMidElement();
		
		//ques 8: third last element
		l1.thirdLastElement();
//		
    	l1.addMidElement(100);
        l1.display();
		
        
		int lenghth= l1.findLengthOfLinkedList();
		System.out.println("Length="+lenghth);
		

		l1.removeNthNode();
		l1.display();
		
//		l1.sortDuplicate();
//		l1.display();
		
//		System.out.println("\nBefore duplicate delition:\n");
		
//		
//		System.out.println();
//		System.out.println("\nAfter duplicate delition:\n");
//		l1.display();
		
		
		l1.removedDuplicateNodes();
		l1.display();
		
//		System.out.println();
		l1.reverseDisplay(l1.getHead());
//		
//		
//		l1.sortLinkedList();
//		l1.display();
		
//		l1.reverseLinkedList();
//		l1.display();
		
	

	}
}
