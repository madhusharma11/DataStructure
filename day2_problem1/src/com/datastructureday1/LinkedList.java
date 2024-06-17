package com.datastructureday1;

public class LinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList() {
        head = null;
    }

    @SuppressWarnings("unused")
	public boolean insert(int data) {

        Node newNode = new Node(data);
        if (newNode == null) {
            return false;
        }


        if (head == null) {
            head = newNode;
            return true;
        }

        Node temp = head;
        if(head.getData() == data) {
            return false;
        }
        while (temp.getNext() != null) {
            temp = temp.getNext();
            if(temp.getData() == data) {
                return false;
            }
        }

        temp.setNext(newNode);
        return true;
    }

    @SuppressWarnings("unused")
	public boolean insertAtPosition(int data, int position) {
        if(position <= 0 || (head == null && position > 1)) {
            return false;
        }

        Node newNode = new Node(data);
        if(newNode == null) {
            return false;
        }

        if(position == 1) {
            newNode.setNext(head);
            head = newNode;
            return true;
        }

      
        Node prev = head;
        for(int i = 1; i < position - 1; i++) {
            prev = prev.getNext();
            if(prev == null) {
                return false;
            }
        }

        newNode.setNext(prev.getNext());
        prev.setNext(newNode);

        return true;
    }


    public void display() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
    
    public int findMaxNumber() {
    	//System.out.println("in findmax");
    	Node temp=head;
    	int max=temp.getData();
    	while(temp.getNext()!=null) {
//   		System.out.println("in while loop");
   		max=(max)>(temp.getNext().getData())?max:temp.getNext().getData();
   			temp=temp.getNext();
   		}
   	return max;
    	
    }
    
    public int findMinNumber() {
    	Node temp=head;
    	int min=temp.getData();
    	while(temp.getNext()!=null) {
    		min=(min)<(temp.getNext().getData())?min:(temp.getNext().getData());
    		temp=temp.getNext();
    	}
    	return min;
    }
    
    public int sumOfAllEvenNumber()
    {
    	Node temp=head;
    	int sum=0;
    while(temp!=null)
    {
    	if(temp.getData()%2==0)
    	{
    		sum=sum+temp.getData();
    	}
    	temp=temp.getNext();
    }
    return sum;
    }
}
