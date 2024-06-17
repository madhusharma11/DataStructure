package com.problem2;


public class ProductTester {
	public static void main(String[] args) {
	LinkListProduct l1=new LinkListProduct();
	Product newProduct=new Product(1,"product1",10,100);
	Product newProduct2=new Product(2,"product2",20,200);
    l1.insertProduct(newProduct);
    l1.insertProduct(newProduct2);
    l1.display();
	}

}
