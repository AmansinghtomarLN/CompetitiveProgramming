package trees;

import java.util.Scanner;

public class CreateTree {

	static Scanner sc = null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = createTree(nodes);

		inOrder(root);
		System.out.println();

		preOrder(root);
		System.out.println();

		postOrder(root);
		System.out.println();

		System.out.println(countNodes(root));
		System.out.println(sumOfNodes(root));
		System.out.println(heightOfTree(root));
		
	}

	static int index = -1;

	static Node createTree(int[] data) {
		index++;
		Node root = null;
//		System.out.println("Enter data: ");
		// int data = sc.nextInt();

		if (data[index] == -1)
			return null;

		root = new Node(data[index]);

		System.out.println("Enter left for " + data);
		root.left = createTree(data);

		System.out.println("Enter right for " + data);
		root.right = createTree(data);

		return root;
	}

	static int heightOfTree(Node root) {
		if (root == null) {
			return 0;
		}
		int a = heightOfTree(root.left);
		int b = heightOfTree(root.right);
		int height = a>b?a:b;
		return height+1;

	}

	
	static int sumOfNodes(Node root) {
		if (root == null) {
			return 0;
		}
		
		int a = sumOfNodes(root.left);
		int b = sumOfNodes(root.right);
		return a+b+root.data;

	}

	
	static int countNodes(Node root) {
		if (root == null) {
			return 0;
		}

		int a = countNodes(root.left);
		int b = countNodes(root.right);
		return a+b+1;

	}

	static void inOrder(Node root) {
		if (root == null) {
			System.out.print("-1 ");
			return;
		}

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	static void preOrder(Node root) {
		if (root == null) {
			System.out.print("-1 ");
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if (root == null) {
			System.out.print("-1 ");
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
}

class Node {
	Node left, right;
	int data;

	public Node(int data) {
		this.data = data;
	}
}
