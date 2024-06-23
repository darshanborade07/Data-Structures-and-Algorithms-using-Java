package Q.A4;
//Java Program To Merge A Linked List Into Another Linked List At Alternate Positions

public class Main {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(20);
		l.insert(10);		
		l.display();
		
		System.out.println(l.chkPalindrome());
		//l.display();
	}

}
