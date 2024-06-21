//package com.midelement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LinkedList2 {
//	private static int count = 0;
//	private Node head;
//
//	public Node getHead() {
//		return head;
//	}
//
//	public LinkedList2() {
//		head = null;
//	}
//
//	//INSERT NODE
//	@SuppressWarnings("unused")
//	public boolean insert(int data) {
//
//		Node newNode = new Node(data);
//		if (newNode == null) {
//			return false;
//		}
//		if (head == null) {
//			head = newNode;
//			count++;
//			return true;
//		}
//		Node temp = head;
////		if (head.getData() == data) {
////			return false;
////		}
//		while (temp.getNext() != null) {
//			temp = temp.getNext();
////			if (temp.getData() == data) {
////				return false;
////			}
//		}
//
//		temp.setNext(newNode);
//		count++;
//		return true;
//	}
//	
//
////DISPLAY
//	public void display() {
//		Node temp = head;
//		while (temp != null) {
//			System.out.print(temp.getData() + " ");
//			temp = temp.getNext();
//		}
//		System.out.println();
//	}
//	
//
//	// quest 2,find mid element
//	public void findMidElement() {
//		System.out.println("count: " + count);
//		int mid = (count + 1) / 2;
//		System.out.println("mid" + mid);
//		Node temp = head;
//		for (int i = 1; i < mid; i++) {
//			temp = temp.getNext();
//		}
//		System.out.println("mid element: " + temp.getData());
//	}
//	
//	//4.How are duplicate nodes removed in an unsorted linked list? 
//	public void removedDuplicateNodes() {
//		List<Integer> list=new ArrayList<>();
//		if(head==null)
//			return;
//		if(head.getNext()==null)
//			return;
//		Node temp=head;
//		while(temp.getNext()!=null) {
//			if(list.contains(temp.getNext().getData()))
//			{
//				temp.setNext(temp.getNext().getNext());
//			}
//			else
//				list.add(temp.getData());
//			temp=temp.getNext();
//		}
//	}
//	
//	
//	// ques 5: How do you find the length of a singly linked list?
//		public int findLengthOfLinkedList() {
//			return count;
//		}
//
//		// 6.How to remove duplicates from a sorted linked list?
//		public void sortDuplicate() {
//			if (head == null)
//				return;
//			if (head.getNext() == null)
//				return;
//			Node temp = head;
//			Node num2 = head.getNext();
//			for (int i = 1; i <= count; i++) {
//				int max = ((temp.getData()) > num2.getData()) 
//						? temp.getData() : num2.getData();
//				System.out.print(temp.getData() + " ");
//				temp = temp.getNext();
//			}
//		}
//
//	
//
////ques 8, find thord last elemnt
//	public void thirdLastElement() {
//		int thirdlast = count - 2;
//		Node temp = head;
//		for (int i = 1; i < thirdlast; i++) {
//			temp = temp.getNext();
//		}
//		System.out.println("count"+count+"thirdlast"+thirdlast);
//		System.out.println("third last element: " + temp.getData());
//	}
//
//	
//	
//	//9.How to remove Nth Node from the end of a linked list? 
//		public void removeNthNode() {
//			if (head == null)
//				return;
//			if (head.getNext() == null)
//				head = null;
//
//			Node last = head;
//			while (last.getNext().getNext() != null) {
//				last = last.getNext();
//			}
//			last.setNext(null);
//		}
//	
//
//	// ques 11 add element at mid position
//	public boolean addMidElement(int data) {
//		Node newnode = new Node(data);
//		int mid = (count + 1) / 2;
//		if (head == null) {
//			head = newnode;
//			count++;
//			return true;
//		}
//		if (head.getNext() == null) {
//			head.setNext(newnode);
//			count++;
//			return true;
//		}
//		Node temp = head;
//		for (int i = 1; i < mid; i++) {
//			temp = temp.getNext();
//		}
//		newnode.setNext(temp.getNext());
//		temp.setNext(newnode);
//		count++;
//		return false;
//	}
//	
//	
//	//1.Java Program To Merge A Linked List Into Another Linked List
//	//At Alternate Positions
//	public void mergeLinkedList(LinkedList2 l1,LinkedList2 l2) {
//		LinkedList2 l3=new LinkedList2();
//		Node temp1=l1.head;
//		Node temp2=l2.head;
//		Node temp3=l3.head;
//		
//		if(count%2==0) {
//			temp3.setNext(temp1);
//			if(count%2!=0)
//				temp3.setNext(temp2);
//		}
//	}
//}
