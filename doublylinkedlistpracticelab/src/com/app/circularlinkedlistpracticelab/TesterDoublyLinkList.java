package com.app.circularlinkedlistpracticelab;

public class TesterDoublyLinkList {

	public static void main(String[] args) {
		CircularLinkedList dl=new CircularLinkedList();
		dl.inserAtPosition(400,1);
		dl.insertCircular(10);
		dl.insertCircular(20);
		dl.insertCircular(50);
		dl.insertCircular(200);
		
		dl.inserAtPosition(1100,1);
		dl.inserAtPosition(11,1);
		
		dl.displayCircular();
     	dl.deleteCircularByValue(11);
		dl.deleteCircularByValue(1100);
		System.out.println("before delete at position");
		dl.displayCircular();
		System.out.println("after delete at position");
		dl.deleteByPoition(1);
		dl.displayCircular();

	}

}
