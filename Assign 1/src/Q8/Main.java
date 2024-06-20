package Q8;
//How do you find the third node from the end in a singly linked list?
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
		l.displayLast3rd();

	}

}
