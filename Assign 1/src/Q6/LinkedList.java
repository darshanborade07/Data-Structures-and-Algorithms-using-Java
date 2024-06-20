package Q6;

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
		
		
		//if head is not null & add element at last
		Node temp = head;
		while(temp.getNext() != null) {
			temp = temp.getNext();
			
		}
		temp.setNext(newNode);
		count++;
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
	
	public boolean removeDuplicate() {
		if(head == null) {
			return false;
		}
		
		Node temp = head;
		Node prev = head;
		Node del =  head.getNext();
		while(temp.getNext() != null) {
			prev = temp;
			del = prev.getNext();
			while(del != null) {
			if(temp.getData() == del.getData()) {
				prev.setNext(del.getNext());
				del = prev.getNext();
			}else {
			
			prev = prev.getNext();
			del = prev.getNext();
			}
			}
			temp = temp.getNext();
		}
		
		return true;
	}
	
}
