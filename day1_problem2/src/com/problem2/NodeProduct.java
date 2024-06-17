package com.problem2;

public class NodeProduct {
	
	private Product data;
	private NodeProduct next;
	public NodeProduct(Product data) {
		this.data=data;
		this.next=null;
	}
	public Product getData() {
		return data;
	}
	public void setData(Product data) {
		this.data = data;
	}
	public NodeProduct getNext() {
		return next;
	}
	public void setNext(NodeProduct next) {
		this.next = next;
	}
	
	

}
