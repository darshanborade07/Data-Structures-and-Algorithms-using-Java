package circularLinkedList;

public class Main {

	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		cl.display();
		cl.insert(60, 4);
		cl.display();
		
		cl.deleteByVal(40);
		cl.display();
		
		cl.deleteByPosition(3);
		cl.display();

	}

}
