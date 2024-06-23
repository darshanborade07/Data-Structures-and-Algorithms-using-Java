package tree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(50);
        bst.insert(10);
        bst.insert(5);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(90);
        bst.insert(60);
        bst.insert(55);
        bst.insert(70);
        bst.insert(100);
        
        System.out.print("Preorder :- ");
        bst.preorder(bst.getRoot());
        System.out.println();
        System.out.print("Inorder :- ");
        bst.inorder(bst.getRoot());
        System.out.println();
        System.out.print("Postorder :- ");
        bst.postorder(bst.getRoot());
        
        bst.del(30);
        System.out.println();
        bst.preorder(bst.getRoot());
        
	}

}
