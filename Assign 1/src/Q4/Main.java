package Q4;
//How are duplicate nodes removed in an unsorted linked list?
public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(10);
		l.insert(50);
		l.insert(60);
		l.insert(30);
		l.insert(10);
		l.display();

		l.removeDuplicate();
		l.display();
		
//		l.insert(70, 1);
//		l.display();
//		
//		l.displayReverse();

	}

}
