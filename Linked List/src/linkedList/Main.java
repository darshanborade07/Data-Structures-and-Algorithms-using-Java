package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);		
		l.display();
		
		l.delByValue(40);
		l.display();
		l.delByPosition(3);
		l.display();
//		l.insert(70, 1);
//		l.display();
//		
//		l.displayReverse();

	}

}
