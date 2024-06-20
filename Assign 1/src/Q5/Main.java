package Q5;
//How do you find the length of a singly linked list?
public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		//l.insert(60);		
		l.display();
		
		System.out.println(l.getCount());
		
		
//		l.insert(70, 1);
//		l.display();
//		
//		l.displayReverse();

	}

}
