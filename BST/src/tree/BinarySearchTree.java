package tree;

import java.util.Stack;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}
	
	

	public Node getRoot() {
		return root;
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

		Node temp = root;
		while (true) {
			if (data == root.getData()) {
				return false;
			}

			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}

		}
	}

//	public void preorder() {
//		System.out.print("Preorder :- ");
//		Node temp = root;
//		Stack<Node> stack = new Stack<Node>();
//		while (temp != null || !stack.isEmpty()) {
//			while (temp != null) {
//				System.out.print(temp.getData() + " ");
//				stack.push(temp);
//				temp = temp.getLeft();
//			}
//			temp = stack.pop().getRight();
//		}
//		System.out.println();
//	}
//
//	public void inorder() {
//		System.out.print("Inorder :- ");
//		Node temp = root;
//		Stack<Node> stack = new Stack<Node>();
//
//		while (temp != null || !stack.empty()) {
//			while (temp != null) {
//				stack.push(temp);
//				temp = temp.getLeft();
//			}
//
//			temp = stack.pop();
//			System.out.print(temp.getData() + " ");
//			temp = temp.getRight();
//		}
//		System.out.println();
//	}
//
//	public void postorder() {
//
//		class Pair {
//			Node node;
//			char flag;
//
//			public Pair(Node node, char flag) {
//				super();
//				this.node = node;
//				this.flag = flag;
//			}
//
//		}
//
//		Stack<Pair> stack = new Stack<>();
//		Node temp = root;
//		System.out.print("Postorder :- ");
//		while(temp != null || !stack.empty()) {
//			while(temp != null) {
//				stack.push(new Pair(temp, 'L'));
//				temp = temp.getLeft();
//			}
//			
//			Pair pair = stack.pop();
//			if(pair.flag == 'L') {
//				temp = pair.node.getRight();
//				pair.flag = 'R';
//				stack.push(pair);
//				
//			}else {
//				System.out.print(pair.node.getData()+" ");
//			}
//			
//		}
//		System.out.println();
//	}
	
	public boolean delete(int data) {
		if(root == null)
			return false;
		
		Node parent = root;
		Node del = root;
		
		//locate del along with parent
		while(del.getData() != data) {
			parent = del;
			if(data < del.getData()) {
				del = del.getLeft();
			}else
				del = del.getRight();
			
			//check if del is null, if del is null means the data is not existing
			if(del == null) {
				return false;
			}
		}
		
		while(true) {
			if(del.getLeft() == null && del.getRight() == null) {
				if(root == del) {
					root = null;
					return true;
				}
				
				if(parent.getLeft() == del) {
					parent.setLeft(null);
				}else
				parent.setRight(null);
				
				return true;
			}
			
			if(del.getLeft() != null) {
				Node max = del.getLeft();
				parent = del;
				while(max.getRight() != null) {
					parent = max;
					max = max.getRight();
				}
				int temp = del.getData();
				del.setData(max.getData());
				max.setData(temp);
				
				del = max;
			}
			
			else{
				
				Node min = del.getLeft();
				parent = del;
				while(min.getLeft() != null) {
					parent = min;
					min = min.getLeft();
				}
				
				int temp = del.getData();
				del.setData(min.getData());
				min.setData(temp);
				
				del = min;
			
			}
		}
		
	}
	
	
	
//    public boolean delete(int data) {
//        if(root == null) {
//            return false;
//        }
//
//        //locate del along with parent
//        Node parent = root;
//        Node del = root;
//        while(del.getData() != data) {
//            parent = del;
//            if(data < del.getData()) {
//                del = del.getLeft();
//            }
//            else {
//                del = del.getRight();
//            }
//            //check if del is null, if del is null means the data is not existing
//            if(del == null) {
//                return false;
//            }
//        }
//
//        while(true) {
//            //check if del is terminal node
//            if (del.getLeft() == null && del.getRight() == null) {
//                //del could be root and terminal both
//                if (root == del) {
//                    root = null;
//                    return true;
//                }
//
//                //check if del is left child or right child and set the appropriate link of the parent to null
//                if (parent.getLeft() == del) {
//                    parent.setLeft(null);
//                } else {
//                    parent.setRight(null);
//                }
//                return true;
//            }
//            //del is non-terminal node, shift del down the tree
//            if (del.getLeft() != null) {
//                //find max from left subtree
//                Node max = del.getLeft();
//                //parent must be following max, as max is the node which will be physically deleted
//                parent = del;
//                while(max.getRight() != null) {
//                    parent = max;
//                    max = max.getRight();
//                }
//                //swap del and max data
//                int temp = del.getData();
//                del.setData(max.getData());
//                max.setData(temp);
//
//                //shift del to max, as max is containing the data to be deleted
//                del = max;
//            }
//            else {
//                //find min from right subtree
//                Node min = del.getRight();
//                parent = del;
//
//                while(min.getLeft() != null) {
//                    parent = min;
//                    min = min.getLeft();
//                }
//
//                //swap
//                int temp = del.getData();
//                del.setData(min.getData());
//                min.setData(temp);
//
//                del = min;
//            }
//        }
//    }
	
	
	public void preorder(Node r) {
		if(r == null) {
			return;
		}
		
		System.out.print(r.getData()+" ");
		preorder(r.getLeft());
		preorder(r.getRight());
	}
	
	public void inorder(Node r) {
		if(r == null) {
			return;
		}
		
		inorder(r.getLeft());
		System.out.print(r.getData()+" ");
		inorder(r.getRight());
	}
	
	public void postorder(Node r) {
		if(r == null) {
			return;
		}
		
		postorder(r.getLeft());
		postorder(r.getRight());
		System.out.print(r.getData()+" ");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

