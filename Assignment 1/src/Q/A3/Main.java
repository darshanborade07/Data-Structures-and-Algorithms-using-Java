package Q.A3;
//Java Program To Merge A Linked List Into Another Linked List At Alternate Positions

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(1);
		l.insert(3);
		l.insert(1);
		l.insert(2);
		l.insert(4);		
		l.display();
		
		LinkedList l1 = new LinkedList();
		l1.insert(3);
		l1.insert(2);
		l1.insert(4);
		
		System.out.println(l.intersectionPresent(l.getHead(), l1.getHead()));
		//l.display();
	}

}
