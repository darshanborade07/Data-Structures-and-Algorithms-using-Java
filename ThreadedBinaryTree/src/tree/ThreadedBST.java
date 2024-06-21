package tree;

public class ThreadedBST {

	private Node root;

	public ThreadedBST() {

		this.root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		
		if(newNode == null) {
	           return false;
	       }
		
		if(root == null) {
			root = newNode;
			return true;
		}
		
		Node parent = root;
		
		while(true) {
			if(parent.getData() == data) {
				return false;
			}
			
			if(data < parent.getData()) {
				if(parent.getLflag() == 'T') {
					newNode.setLeft(parent.getLeft());
					newNode.setRight(parent);
					parent.setLeft(newNode);
					parent.setLflag('L');
				}
				parent = parent.getLeft();
			}else {
				if(parent.getRflag() == 'T') {
					newNode.setLeft(parent);
					newNode.setRight(parent.getRight());
					parent.setRight(newNode);
					parent.setRflag('L');
				}
				parent = parent.getRight();
			}
		}
	}
    public void inOrder() {
        System.out.print("Inorder :- ");
        Node temp = root;
        char flag = 'L';

        while(temp != null) {
            while(temp.getLflag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            System.out.print(temp.getData() + " ");
            flag = temp.getRflag();
            temp = temp.getRight();
        }
        System.out.println();
    }
}
