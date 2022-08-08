package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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

		int[] arr1 = new int[] { 10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1 };
		int[] arr2 = new int[] { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, -1, 40, 90, -1, 100,
				-1, -1 };

		Node root = createTree(arr2);

//		displayPrePostIn(root);
		System.out.println();

		display(root);
		System.out.println();

		int size = sizeOfTree(root);
		System.out.println("size of Tree " + size);

		int sum = sumOfNodes(root);
		System.out.println("Sum of Nodes " + sum);

		int max = maximumOfNodes(root);
		System.out.println("Maximum of Nodes " + max);

		int heightByNodes = heightOfTreeByNodes(root);
		System.out.println("Height of Tree " + heightByNodes);

		int heightByEdges = heightOfTreeByEdges(root);
		System.out.println("Height of Tree " + heightByEdges);

		// levelOrderTraversal(root);
		System.out.println();

		levelOrderZigZag(root);
		System.out.println();

		mirrorOfGenericTree(root);
		System.out.println();
		
		linearizeGenericTree(root);
		System.out.println();
		
		System.out.println(findNode(root,1100));
		
		System.out.println(nodeToRootPath(root,110));
		
		
		
		
		System.out.println(similarTree(root, root));
		
		
		System.out.println();
		removeLeavesFromTree(root);
		display(root);
	}
	
	
	static boolean symmetricTree(Node root) {
		
		return similarTree(root, root);
	}

	static boolean removeLeavesFromTree(Node root) {
	
		if(root.children.size()==0) {
			return true;
		}
		for(int i =root.children.size()-1; i>=0;i--) {
			boolean result = removeLeavesFromTree(root.children.get(i));
			if(result) {
		//		System.out.println(root.children.get(i).data);
				root.children.remove(root.children.get(i));
			}
		}
		
		
		return false;
	}
	
	
	static ArrayList<Integer> nodeToRootPath(Node root, int data){
		
		if(root.data==data) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(root.data);
			return al;
		}
		
		for(Node node : root.children) {
			ArrayList<Integer> parentAl = nodeToRootPath(node, data);
			if(parentAl.size()>0) {
			parentAl.add(root.data);
			return parentAl;
			}
		}
		
		
		return new ArrayList<>();
	}
	
	
	static boolean findNode(Node root, int data) {
		
		if(root.data==data) {
			return true;
		}else {
			for(Node node: root.children) {
			boolean result = 	findNode(node, data);
			if(result) {
				return true;
			}
			}
		}
		
		return false;
	}
	
	static void linearizeGenericTree(Node root) {
				
		for(Node node : root.children) {
			linearizeGenericTree(node);
		}
		
		
	}
	
	static boolean similarTree(Node n1, Node n2) {
		return true;
	}
	
	static void mirrorOfGenericTree(Node root) {


	}

	static void levelOrderZigZag(Node root) {

		Stack<Node> mainStack = new Stack<>();
		Stack<Node> childStack = new Stack<>();

		mainStack.push(root);
		int level = 0;
		while (!mainStack.isEmpty()) {

			Node current = mainStack.pop();
			System.out.print(current.data + " ");
			if (level % 2 == 0) {
				for (Node node : current.children) {
					childStack.push(node);
				}
			} else {
				for (int i = current.children.size() - 1; i >= 0; i--) {
					childStack.push(current.children.get(i));

				}
			}

			if (mainStack.size() == 0) {
				mainStack = childStack;
				childStack = new Stack<>();
				level++;
				System.out.println();
			}
//			if(level==2) {break;}

		}
	}

	// level order traversal - >add node - > remove -> print -> add children
	static void levelOrderTraversal(Node root) {

		Queue<Node> queue = new LinkedList<GenericTree.Node>();

		queue.add(root);
		queue.add(null);

		while (queue.size() > 0) {
			Node currentNode = queue.remove();

			if (currentNode == null) {
				System.out.println();
				if (queue.isEmpty()) {
					break;
				} else {
					queue.add(null);
				} // reinserting null in the queue to print next level elements
			} else {
				System.out.print(currentNode.data + " ");
				for (Node node : currentNode.children) {
					queue.add(node);
				}
			}

		}

	}

	// height in term of nodes
	static int heightOfTreeByNodes(Node root) {
		int height = 0;

		for (Node node : root.children) {
			int c = heightOfTreeByNodes(node);
			height = height > c ? height : c;
		}
		return height + 1;
	}

	static int heightOfTreeByEdges(Node root) {
		int height = -1;

		for (Node node : root.children) {
			int c = heightOfTreeByEdges(node);
			height = height > c ? height : c;
		}
		return height + 1;
	}

	static int maximumOfNodes(Node root) {
		int max = root.data;
		for (Node node : root.children) {
			int value = maximumOfNodes(node);
			max = value > max ? value : max;
		}

		return max;
	}

	static int sumOfNodes(Node root) {
		int sum = 0;

		for (Node node : root.children) {
			int c = sumOfNodes(node);
			sum = sum + c;
		}

		return sum + root.data;
	}

	static int sizeOfTree(Node root) {

		int size = 0;

		// size = root.children.size();

		for (Node node : root.children) {
			int c = sizeOfTree(node);
			size = size + c;
		}

		return size + 1;
	}

	static Node createTree(int[] arr) {
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

		String s = root.data + " -> ";

		for (Node node : root.children) {
			s += node.data + " ,";
		}
		System.out.println(s);

		for (Node node : root.children) {
			display(node);
		}

	}

	static void displayPrePostIn(Node root) {

		// node ka left - > pre area of Euler
		System.out.println("Node Pre " + root.data);

		for (Node node : root.children) {
			System.out.println("Edge Pre " + root.data + "-" + node.data);
			displayPrePostIn(node);
			System.out.println("Edge Post " + root.data + "-" + node.data);
		}

		// node ka right - > post area of Euler
		System.out.println("Node Post" + root.data);
	}

}
