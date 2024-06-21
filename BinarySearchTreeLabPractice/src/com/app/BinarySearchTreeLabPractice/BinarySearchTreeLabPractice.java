package com.app.BinarySearchTreeLabPractice;

import java.util.Stack;

public class BinarySearchTreeLabPractice {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinarySearchTreeLabPractice() {
		this.root = null;
	}

	@SuppressWarnings("unused")
	public boolean insert(int data) {
		Node newnode = new Node(data);
		if (newnode == null)
			return false;
		if (root == null) {
			root = newnode;
			return true;
		}
		Node temp = root;
		while (true) {
			if (data == temp.getData())
				return false;
			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newnode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newnode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void inorder() {
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		System.out.println("\ninOrder!!");
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void preOrder() {
		Node temp = root;
		if (root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		System.out.println("Pre Oder");
		while (temp != null || !stack.empty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}

	public boolean postOrder() {
		Node temp = root;
		System.out.println("post Order");
		if (root == null)
			return false;
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.flag = flag;
				this.node = node;
			}
		}
		Stack<Pair> stack = new Stack<Pair>();
		while(temp != null || !stack.empty()) {
		while (temp != null) {
			stack.push(new Pair(temp, 'l'));
			temp = temp.getLeft();
		}
		Pair pair = stack.pop();
		if (pair.flag == 'l') {
			temp = pair.node.getRight();
			pair.flag = 'r';
			stack.push(pair);
		} else {
			System.out.print(pair.node.getData() +" ");
		}
		}
		System.out.println();
		return false;
	}
	
	
	public void postOrderRecursion(Node root) {
		if(root==null)
			return;
		postOrderRecursion(root.getLeft());
		postOrderRecursion(root.getRight());
		System.out.print(root.getData()+" ");
	}
	
	public void inOrderRecursion(Node root) {
		if(root==null)
			return;
		inOrderRecursion(root.getLeft());
		System.out.print(root.getData()+" ");
		inOrderRecursion(root.getRight());
	}
	
	public void preOrderRecursion(Node root) {
		if(root==null)
			return;
		System.out.print(root.getData()+" ");
		preOrderRecursion(root.getLeft());
		preOrderRecursion(root.getRight());
	}

}
