package Q7;
///How do you reverse a linked list?
public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(30);
		l.insert(20);
		l.insert(10);
		l.insert(40);
		l.insert(10);
		l.insert(50);
		l.insert(20);
		l.insert(10);		
		l.display();
		
//		l.insert(70, 1);
//		l.display();
//		
		l.displayReverse();
		l.displayReverse(l.getHead());

	}

}
