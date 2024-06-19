package com.app.stack;


@SuppressWarnings("unused")
public class Stack<T> {
	private int size;
	private T[] arr;
	private static int top=-1;
	
	
	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.size=size;
		arr=(T[]) new Object[size];
	}
	
	public boolean isFull() {
		if(top==size-1)
			return true;
		return false;
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	
	public boolean push(T data) {
		if(isFull())
			return false;
		if(isEmpty() || top<size-1) {
			arr[++top]=data;
			System.out.println("inside push"+top+" "+arr[top]);
			return true;
		}
		return false;
	}
	 public boolean pop() {
		 if(isEmpty())
			 return false;
			if (isFull() || top < size - 1) {
				System.out.println("inside pop,popped elemnet" + top + " " + arr[top]);
			 top--;
			 return true;
		 }
		return false;
	 }
	
	public void display() {
		if(isEmpty())
			return;
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]+" ");
		}	
	}
	
	public void peek() {
		System.out.println("top most element: "+arr[top]);
	}
	
}
