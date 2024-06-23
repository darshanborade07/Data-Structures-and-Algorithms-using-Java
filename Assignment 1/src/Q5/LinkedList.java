package Q5;

import java.util.Stack;

public class LinkedList {

	private Node head;
	private static int count=1;
	
	public LinkedList() {
		head=null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insert(int data) {
		
		Node newNode = new Node(data);
		
		if(newNode == null) {
			count--;
			return false;
		}
		
		//NewNode added at 1st if head is null
		if(head == null) {
			head = newNode;
			count++;
			return true;
		}
		
		if(head.getData()== data) {
			count--;
			return false;
		}
		
		//if head is not null & add element at last
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
			
			if(temp.getData() == data) {
				
				return false;
			}
		}
		temp.setNext(newNode);
		count++;
		return true;
	}
	
	
	public boolean insert(int data, int pos) {
		//if pos is 0 or head is null and pos is > 1
		if(pos <=0 || (head == null && pos > 1)) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		//if pos is 1st
		if(pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		
		//if pos is in between 
		Node prev = head;
		for (int i = 1; i < pos -1; i++) {
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
		while (temp != null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}

    public int getCount() {
    	if(head == null) {
    		return 0;
    	}
    	return count;
    }
	
}
