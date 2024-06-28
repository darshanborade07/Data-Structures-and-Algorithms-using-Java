package linkedList;

import java.util.Stack;

public class LinkedList {

	private Node head;
	private static int count;

	public LinkedList() {
		head = null;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		// NewNode added at 1st if head is null
		if (head == null) {
			head = newNode;
			count++;
			return true;
		}

		if (head.getData() == data) {
			return false;
		}

		// if head is not null & add element at last
		Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();

			if (temp.getData() == data) {
				return false;
			}
		}
		temp.setNext(newNode);
		count++;
		return true;
	}

	public boolean insert(int data, int pos) {
		// if pos is 0 or head is null and pos is > 1
		if (pos <= 0 || (head == null && pos > 1)) {
			return false;
		}

		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}

		// if pos is 1st
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}

		// if pos is in between
		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();
			if (prev == null) {
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
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println(count);
		System.out.println();
	}

	public boolean delByValue(int data) {
		if (head == null) {
			return false;
		}

		if (head.getData() == data) {
			head = null;
			return true;
		}

		Node prev = head, del = head;
		while (del.getData() != data) {
			prev = del;
			del = del.getNext();
			if (del == null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}

	public boolean delByPosition(int pos) {
		if (head == null || pos <= 0) {
			return false;
		}

		if (pos == 1) {
			head = null;
			return true;
		}

		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.getNext();

			if (prev.getNext() == null) {
				return false;
			}
		}
		Node del = prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}

	public boolean binarySearch(int key) {
		Node temp = head;
		Node left = head;
		Node right = head;
		Node m = head;
		Node mid = head;
		if (temp == null) {
			return false;
		}
		 while (true) {
			 mid = head;
		while (right != null && right.getNext() != null) {
			m = mid;
			if (right.getNext().getNext() == null) {
				right = right.getNext();
				break;
			} else {
				mid = mid.getNext();
				right = right.getNext().getNext();
			}
		}
		System.out.println(m.getData());
		if(mid.getData() == key) {
			return true;
		}
		
		if(key < mid.getData()) {
			right = m;
		}else {
			left = mid.getNext();
		}
		
		System.out.println(mid.getData());
		System.out.println(right.getData());
	}
		
	 }
	
	
	public boolean sort() {
		if(head==null && head.getNext()==null) {
			return false;
		}
		Node prev=head;
		Node next=head.getNext();
		
		while(next!=null) {
			if(prev.getData()>next.getData()) {
				int d=prev.getData();
				prev.setData(next.getData());
				next.setData(d);
				prev=head;
				next=head.getNext();
			}
				
			else {
				prev=next;
				next=next.getNext();
			}
			
		}
		return true;
	}

}
