package com.app.circularlinkedlistpracticelab;

public class CircularLinkedList {
	private NodeCircular head;

	public CircularLinkedList() {
		this.head = null;
	}

	public NodeCircular getHead() {
		return head;
	}

	public void setHead(NodeCircular head) {
		this.head = head;
	}

	// INSERT DATA
	@SuppressWarnings("unused")
	public boolean insertCircular(int data) {
		NodeCircular newnode = new NodeCircular(data);

		if (newnode == null) {
			return false;
		}
		if (head == null) {
			head = newnode;
			head.setNext(newnode);
			return true;
		}

		NodeCircular last = head;
		while (last.getNext() != head) {
			last = last.getNext();
		}
		last.setNext(newnode);
		newnode.setNext(head);
		return true;

	}
//INSERT AT POSITION
	public boolean inserAtPosition(int data, int position) {
		NodeCircular newnode = new NodeCircular(data);
		if ((head == null && position > 1 || position <= 0)) {
			return false;
		}
		if (position == 1) {
			if (head == null) {
				head = newnode;
				head.setNext(newnode);
				return true;
			}

			NodeCircular last = head;
			while (last.getNext() != head) {
				last = last.getNext();
			}
			newnode.setNext(head);
			head = newnode;
			last.setNext(newnode);
			return true;
		}

		NodeCircular prev = head;

		for (int i = 1; i < position - 1; i++) {
			prev = prev.getNext();
			if (prev == head) {
				return false;
			}
		}

		newnode.setNext(prev.getNext());
		prev.setNext(newnode);

		return true;

	}
//DISPLAY
	public void displayCircular() {
		System.out.println("inside display");
		if (head == null)
			return;
		NodeCircular temp = head;
		do {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		} while (temp != head);
		System.out.println();
	}
//DELETE BY VALUE
	public boolean deleteCircularByValue(int data) {
		if (head == null)
			return false;

		
		if (head.getData() == data) {
			if (head.getNext() == head) {
				head = null;
			return true;
		}
		
		NodeCircular last = head;
		while (last.getNext() != head) {
			last = last.getNext();
		}
		
		head=head.getNext();
		last.setNext(head);
		return true;
		
	}
		NodeCircular prev=head;
		NodeCircular del=head;
		while (del.getData() != data) {
            prev = del;
            del = del.getNext();
            if (del == head) {
                return false;
            }
        }
		
		prev.setNext(del.getNext());
		return true;
		
		
	}
	//DELETE BY POSITION
	public boolean deleteByPoition(int position) {
		if(head==null || position<=0)
		return false;
		
		if(position==1) {
			if(head.getNext()==head) {
				head=null;
				return true;
			}
			NodeCircular last=head;
			while(last.getNext()!=head) {
				last=last.getNext();
			}
			
			head=head.getNext();
			last.setNext(head);
			return true;
		}
		
		NodeCircular prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev.getNext()==head)
				return false;
		}
		
	prev.setNext(prev.getNext().getNext());
		
		return true;
	}
	
}
