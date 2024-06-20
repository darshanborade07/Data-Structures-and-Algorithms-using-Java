package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList cl = new DoublyLinkedList();
		
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		cl.display();
		cl.insert(60, 4);
		cl.display();
		
//		cl.deleteByValue(50);
//		cl.display();
//		cl.deleteByValue(10);
//		cl.display();
		
		cl.deleteByPosition(2);
		cl.display();
		
		cl.deleteByPosition(1);
		cl.display();
		
		cl.deleteByPosition(4);
		cl.display();
	}

}
