package com.app.circularlinkedlistpracticelab;

public class NodeCircular{
	private int data;
	private NodeCircular next;
	
	
	public NodeCircular(int data) {
		this.data=data;
	    next=null;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public NodeCircular getNext() {
		return next;
	}


	public void setNext(NodeCircular next) {
		this.next = next;
	}
	
	

}
