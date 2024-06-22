package tree;

public class Main {

	public static void main(String[] args) {
		ThreadedBST t = new ThreadedBST();
		
		t.insert(50);
		t.insert(20);
		t.insert(80);
		t.insert(30);
		t.insert(10);
		t.insert(70);
		t.insert(90);
		t.insert(60);
		
		t.preorder();
		t.inorder();
		//t.postorder();
	}

}
