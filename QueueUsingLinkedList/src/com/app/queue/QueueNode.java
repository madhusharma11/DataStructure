package com.app.queue;

public class QueueNode {
private int data;
private QueueNode next;
private QueueNode prev;
public QueueNode(int data) {
	this.data=data;
	this.next=null;
	this.prev=null;

}


public QueueNode getPrev() {
	return prev;
}


public void setPrev(QueueNode prev) {
	this.prev = prev;
}


public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public QueueNode getNext() {
	return next;
}
public void setNext(QueueNode next) {
	this.next = next;
}
@Override
public String toString() {
	return "data=" + data + "";
}


}
