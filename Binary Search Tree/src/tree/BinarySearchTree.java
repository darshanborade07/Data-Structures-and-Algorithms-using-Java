package tree;

import java.util.Stack;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
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

	public void preorder() {
		System.out.print("Preorder :- ");
		Node temp = root;
		Stack<Node> stack = new Stack<Node>();
		while (temp != null || !stack.isEmpty()) {
			while (temp != null) {
				System.out.print(temp.getData() + " ");
				stack.push(temp);
				temp = temp.getLeft();
			}
			temp = stack.pop().getRight();
		}
		System.out.println();
	}

	public void inorder() {
		System.out.print("Inorder :- ");
		Node temp = root;
		Stack<Node> stack = new Stack<Node>();

		while (temp != null || !stack.empty()) {
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeft();
			}

			temp = stack.pop();
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void postorder() {

		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				super();
				this.node = node;
				this.flag = flag;
			}

		}

		Stack<Pair> stack = new Stack<>();
		Node temp = root;
		System.out.print("Postorder :- ");
		while(temp != null || !stack.empty()) {
			while(temp != null) {
				stack.push(new Pair(temp, 'L'));
				temp = temp.getLeft();
			}
			
			Pair pair = stack.pop();
			if(pair.flag == 'L') {
				temp = pair.node.getRight();
				pair.flag = 'R';
				stack.push(pair);
				
			}else {
				System.out.print(pair.node.getData()+" ");
			}
			
		}
		System.out.println();
	}
	
}
