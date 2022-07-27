package trees;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTree {

	static class Node {

		int data;
		ArrayList<Node> children = new ArrayList<>();

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100,
				-1, -1, -1 };

		Node root = createTree(arr);
		
		display(root);
		System.out.println();
		
		int size = sizeOfTree(root);
		System.out.println("size of Tree "+ size);
		
		int sum = sumOfNodes(root);
		System.out.println("Sum of Nodes "+sum);
		
		int max = maximumOfNodes(root);
		System.out.println("Maximum of Nodes "+max);
		
		int heightByNodes = heightOfTreeByNodes(root);
		System.out.println("Height of Tree "+heightByNodes);

		
		int heightByEdges = heightOfTreeByEdges(root);
		System.out.println("Height of Tree "+heightByEdges);

	}
	// height in term of nodes
	static int heightOfTreeByNodes(Node root) {
		int height = 0;
		
		for(Node node :root.children) {
			int c  = heightOfTreeByNodes(node);
			height = height>c?height:c;
		}
		return height+1;
	}

	
	static int heightOfTreeByEdges(Node root) {
		int height = -1;
		
		for(Node node :root.children) {
			int c  = heightOfTreeByEdges(node);
			height = height>c?height:c;
		}
		return height+1;
	}

	static int maximumOfNodes(Node root) {
		int max = root.data;
		for(Node node: root.children) {
			int value  = maximumOfNodes(node);
			max = value>max?value:max;
		}
		
		return max;
	}
	
	
	static int sumOfNodes(Node root) {
		int sum =0;
		
		for(Node node:root.children) {
			int c= 	sumOfNodes(node);
			sum = sum+c;
			}
		
		return sum+root.data;
	}
	
	static int sizeOfTree(Node root) {
		
		int size = 0;
		
		//size = root.children.size();
		
		for(Node node:root.children) {
		int c = 	sizeOfTree(node);
		size = size+c;
		}
		
		return size+1;
	}
	
	static  Node createTree(int[] arr) {
		Node root = null;
		Stack<Node> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == -1) {
				stack.pop();
			} else {
				Node t = new Node(arr[i]);
				 
				if (stack.size() > 0) {
					stack.peek().children.add(t);
				} else {
					root = t;
				}
				stack.push(t);
			}

		}
		return root;
	}
	
	
	static void display(Node root) {
		
		String s = root.data+" -> ";
		
		for(Node node:root.children) {
			s += node.data+" ,";
		}
		System.out.println(s);
		
		for(Node node:root.children) {
			display(node);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
