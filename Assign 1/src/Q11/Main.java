package Q11;
//Java Program To Merge A Linked List Into Another Linked List At Alternate Positions

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);
		l.display();
		
		l.addAtMiddle(3);
		l.display();
	}

}
