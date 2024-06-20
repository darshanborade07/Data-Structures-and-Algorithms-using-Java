package doublyLinkedList;

import doublyLinkedList.*;

public class DoublyLinkedList {
	
	private Node head;
	
	public DoublyLinkedList() {
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
			return false;
		}
		
		if(head == null) {
			head = newNode;
			return true;
		}
		
		Node last = head;
		while(last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		
		return true;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public boolean insert(int data, int pos) {
		if((head == null && pos > 1) || pos <= 0) {
			return false;
		}
		
		Node newNode = new Node(data);
		if(newNode == null) {
			return false;
		}
		
		if(pos == 1) {
			if(head != null) {
				newNode.setNext(head);
				head.setPrev(newNode);
			}
			head = newNode;
			return true;
		}
		
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			
			if(prev == null) {
				return false;
			}
		}
		Node next = prev.getNext();
		
		newNode.setPrev(prev);
		if(next != null) {
		newNode.setNext(prev.getNext());
		next.setPrev(newNode);
		}
		prev.setNext(newNode);
		return true;
	}
	
	public boolean deleteByValue(int data) {
		if(head == null) {
			return false;
		}
		
		if(head.getData() == data) {
			if(head.getNext() == null) {
				head = null;
				return true;
			}
			
			Node next = head.getNext();
			next.setPrev(null);
			head = next;
			return true;
		}
		
		Node prev =  head, del = head;
		while(del.getData() != data) {
			prev = del;
			del = del.getNext();
			
			if(del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		if(prev.getNext() != null) {
		Node next = del.getNext();
		next.setPrev(prev);
		}
		return true;
	}
	
	public boolean deleteByPosition(int pos) {
		if(head == null || pos <= 0) {
			return false;
		}
		
		if(pos == 1) {
			head = head.getNext();
			head.setPrev(null);
			return true;
		}
		
		Node prev = head; 
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			
			if(prev.getNext() == null) {
				return false;
			}
		}
		
		Node del = prev.getNext();
		Node next = del.getNext();
		
		prev.setNext(next);
		if(next != null) {
		next.setPrev(prev);
		}
		return true;
	}
}
