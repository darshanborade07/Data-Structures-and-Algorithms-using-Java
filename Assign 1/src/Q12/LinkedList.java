package Q12;

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
	
	public void sort() {
		LinkedList l = new LinkedList();
		Node temp = head;
		Node next = head.getNext();
		
		while(temp.getNext() != null) {
		while(next != null) {
			if(temp.getData() > next.getData()) {
				int d = temp.getData();
				temp.setData(next.getData());
				next.setData(d);
				
			}
			next = next.getNext();
		}
		l.insert(temp.getData());
		temp = temp.getNext();
		}
		l.display();
	}
	
}
