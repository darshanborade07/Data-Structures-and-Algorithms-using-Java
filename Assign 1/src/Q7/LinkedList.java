package Q7;

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
	
    public void displayReverse() {
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp);
            temp = temp.getNext();
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getData() + " ");
        }
        System.out.println();
    }

    public void displayReverse(Node temp) {
        if(temp == null) {
            System.out.println();
            return;
        }
        displayReverse(temp.getNext());
        System.out.print(temp.getData() + " ");
    }
	
}
