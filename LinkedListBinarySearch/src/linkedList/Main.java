package linkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		//l.insert(60);		
		l.display();
		
		System.out.println(l.binarySearch(10));
//		l.sort();
//		l.display();
	}

}
