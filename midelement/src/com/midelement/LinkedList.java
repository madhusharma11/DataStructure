package com.midelement;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedList {
	private  int count = 0;
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkedList() {
		head = null;
	}

	//INSERT NODE
	@SuppressWarnings("unused")
	public boolean insert(int data) {

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			this.count++;
			return true;
		}
		Node temp = head;
//		if (head.getData() == data) {
//			return false;
//		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
//			if (temp.getData() == data) {
//				return false;
//			}
		}

		temp.setNext(newNode);
		this.count++;
		return true;
	}
	

//DISPLAY
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	

	// quest 2,find mid element
	public void findMidElement() {
		int mid = (this.count + 1) / 2;
		Node temp = head;
		for (int i = 1; i < mid; i++) {
			temp = temp.getNext();
		}
		System.out.println("mid element: " + temp.getData());
	}
	
	//4.How are duplicate nodes removed in an unsorted linked list? 
	public void removedDuplicateNodes() {
		List<Integer> list=new ArrayList<>();
		if(head==null)
			return;
		if(head.getNext()==null)
			return;
		Node temp=head.getNext();
		Node prev=head;
		list.add(prev.getData());	
		while(temp!=null) {
			if(list.contains(temp.getData()))
			{
				prev.setNext(temp.getNext());
			}
			else {
				list.add(temp.getNext().getData());
			prev=temp;}
			temp=temp.getNext();
		}
	}
	
	
	// ques 5: How do you find the length of a singly linked list?
		public int findLengthOfLinkedList() {
			return this.count;
		}

	

	

//ques 8, find thord last elemnt
	public void thirdLastElement() {
		int thirdlast = this.count - 2;
		Node temp = head;
		for (int i = 1; i < thirdlast; i++) {
			temp = temp.getNext();
		}
		System.out.println("third last element: " + temp.getData());
	}

	
	
	//9.How to remove Nth Node from the end of a linked list? 
		public void removeNthNode() {
			if (head == null)
				return;
			if (head.getNext() == null)
				head = null;

			Node last = head;
			while (last.getNext().getNext() != null) {
				last = last.getNext();
			}
			last.setNext(null);
		}
	

	// ques 11 add element at mid position
	public boolean addMidElement(int data) {
		Node newnode = new Node(data);
		int mid = (this.count + 1) / 2;
		if (head == null) {
			head = newnode;
			this.count++;
			return true;
		}
		if (head.getNext() == null) {
			head.setNext(newnode);
			this.count++;
			return true;
		}
		Node temp = head;
		Node prev=head;
		for (int i = 1; i < mid; i++) {
			prev=temp;
			temp = temp.getNext();	
		}
		newnode.setNext(temp);
		prev.setNext(newnode);
		this.count++;
		return false;
	}
	
	
	//1.Java Program To Merge A Linked List Into Another Linked List
		//At Alternate Positions
//		public void mergeLinkedList(LinkedList l1,LinkedList l2) {
//			LinkedList l3=new LinkedList();
//			Node temp1=l1.head;
//			Node temp2=l2.head;
//			Node temp3=l3.head;
//			
//			if(this.count%2==0) {
//				temp3.setNext(temp1);
//				if(this.count%2!=0)
//					temp3.setNext(temp2);
//			}
//		}
		
		public void reverseLinkedList() {
			Stack<Node> stack =new Stack<>();
			Node temp=head;
			while(temp!=null) {
			stack.push(temp);
			temp=temp.getNext();
			}
			while(!stack.isEmpty()) {
				System.out.print(stack.pop().getData()+" ");
			}
		}
		public void reverseDisplay(Node temp) {
			
			if(temp==null) {
				System.out.println();
				return;
			}
			reverseDisplay(temp.getNext());
			System.out.print(temp.getData()+" ");
		}
		
//		public void sortLinkedList() {
//			List<Integer> list=new ArrayList<>();
//			if(head==null)
//				return;
//				if(head.getNext()==null)
//					return;
//				Stack<Node> stack=new Stack<Node>();
//				Node temp=head;
//				while(temp.getNext().getNext()!=null)
//				{
//					if(temp.getData()<temp.getNext().getData()) {
//						list.add(temp.getData());	
//					}
//					temp=temp.getNext();
//				}
//				System.out.println(list);
//				
//		}
		
}
