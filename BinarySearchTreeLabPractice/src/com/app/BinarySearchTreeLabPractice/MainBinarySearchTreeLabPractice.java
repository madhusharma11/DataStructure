package com.app.BinarySearchTreeLabPractice;

public class MainBinarySearchTreeLabPractice {
	public static void main(String[] args) {
		BinarySearchTreeLabPractice bl = new BinarySearchTreeLabPractice();
		bl.insert(100);
		bl.insert(150);
		bl.insert(50);
		bl.insert(40);
		bl.insert(45);
		bl.insert(125);
		bl.insert(175);
		bl.insert(200);
		bl.inOrderRecursion(bl.getRoot());
		System.out.println();
		bl.postOrderRecursion(bl.getRoot());
		System.out.println();
		bl.preOrderRecursion(bl.getRoot());
//		bl.inorder();
//		System.out.println();
//		bl.preOrder();
//		bl.postOrder();
	
	}
}
