package tree;

public class Main {

	public static void main(String[] args) {
		ThreadedBST t = new ThreadedBST();
		
		t.insert(8);
		t.insert(10);
		t.insert(12);
		t.insert(20);
		t.insert(50);
		t.insert(68);
		t.insert(90);
		t.insert(92);
		
		t.inOrder();

	}

}
