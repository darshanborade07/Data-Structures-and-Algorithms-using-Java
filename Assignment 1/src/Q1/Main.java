package Q1;
//Java Program To Merge A Linked List Into Another Linked List At Alternate Positions

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);		
		l.display();
		
		LinkedList l1 = new LinkedList();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
		l1.display();
		
		LinkedList.merge(l, l1);
		
//		l.insert(70, 1);
//		l.display();
//		
//		l.displayReverse();

	}

}
