package com.problem2;

public class LinkListProduct {
	private NodeProduct head;

	public NodeProduct getHead() {
		return head;
	}

	public LinkListProduct() {
		head = null;
	}

	
	@SuppressWarnings("unused")
	public boolean insertProduct(Product data) {
		NodeProduct newnode = new NodeProduct(data);
		if ((newnode == null)||(head.getData() == data)) {
			return false;
		}
		if (head == null) {
			head = newnode;
			return true;
		}

		NodeProduct temp = head;
		
		

		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getData() == data) {
				return false;
			}
		}
		temp.setNext(newnode);
		return true;
	}
	
	public void display() {
		NodeProduct temp=head;
		while(temp!=null) {
			System.out.println(temp.getData()+" ");
			temp=temp.getNext();
		}
		 System.out.println();
	}
}
