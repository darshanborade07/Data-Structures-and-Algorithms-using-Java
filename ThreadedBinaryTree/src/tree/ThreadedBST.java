package tree;

public class ThreadedBST {

	private Node root;

	public ThreadedBST() {
		this.root = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);

		if (newNode == null) {
			return false;
		}

		if (root == null) {
			root = newNode;
			return true;
		}

		Node parent = root;
		while (true) {
			if (parent.getData() == data) {
				return false;
			}

			if (data < parent.getData()) {
				// to left
				if (parent.getLflag() == 'T') {
					// parent does not have a left child, so newnode will become the left child of
					// the parent
					newNode.setRight(parent);
					newNode.setLeft(parent.getLeft());
					parent.setLeft(newNode);
					parent.setLflag('L');
					return true;

				}
				parent = parent.getLeft();
			} else {
				// right
				if (parent.getRflag() == 'T') {
					// new node become the right child of parent
					newNode.setLeft(parent);
					newNode.setRight(parent.getRight());
					parent.setRight(newNode);
					parent.setRflag('L');
					return true;
				}
				parent = parent.getRight();
			}
		}
	}

	public void inorder() {
		System.out.print("Inorder: ");
		Node temp = root;
		char flag = 'L';

		while (temp != null) {
			while (temp.getLflag() == 'L' && flag == 'L') {
				temp = temp.getLeft();
			}

			System.out.print(temp.getData() + " ");
			flag = temp.getRflag();
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void preorder() {
		System.out.print("Preorder :- ");
		Node temp = root;
		char flag = 'L';

		while (temp != null) {
			while (temp.getLflag() == 'L' && flag == 'L') {
				System.out.print(temp.getData() + " ");
				temp = temp.getLeft();
			}
			if (flag == 'L') {
				System.out.print(temp.getData() + " ");
			}
			flag = temp.getRflag();
			temp = temp.getRight();
		}
		System.out.println();
	}

    public void postorder() {
        Node temp = root;
        char flag = 'L';

        System.out.println("Postorder: ");

        while(temp != null) {
            //check if temp has a left subtree and the left is not already visited
            while(temp.getLflag() == 'L' && flag == 'L') {
                temp = temp.getLeft();
            }

            //check out if temp has a right subtree or not
            flag = temp.getLflag();
            if(flag == 'L') {
                //temp has a right subtree
                temp = temp.getRight();
            }
            else {
                while(true) {
                    //temp does not have a right subtree
                    System.out.print(temp.getData() + " ");
                    //check if temp has right child of parent
                    if (isRightChild(temp)) {
                        //locate parent
                        while (temp.getLflag() == 'L') {
                            temp = temp.getLeft();
                        }
                        temp = temp.getLeft();
                    } else {
                        //temp is a left child
                        //locate parent and continue to the beginning
                        while(temp.getLflag() == 'L') {
                            temp = temp.getRight();
                        }
                        temp = temp.getRight();
                        break;
                    }
                }
            }
        }
        System.out.println();
    }

    private boolean isRightChild(Node node) {
        if(node == root) {
            return false;
        }

        Node temp = root;
        while(true) {
            if(node.getData() < temp.getData()) {
                temp = temp.getLeft();
                if(temp == node) {
                    return false;
                }
            }
            else {
                temp = temp.getRight();
                if(temp == node) {
                    return true;
                }
            }
        }
    }
}
