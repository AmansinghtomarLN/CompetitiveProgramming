package stack;


public class StackLinkedListImplementation {
	
	static Node top;
	static int size = 0;
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		push(1); 
		push(3);
		push(5);
		push(10);
		display();
		size();
		System.out.println();
		pop();		pop();		pop();	pop();
		display();
	}
	
	public static int pop() {
		if(top==null) {
			return -1;
		}
		top = top.next;
		return top.data;
	}
	
	
	public static void size() {
		System.out.println(size);
	}

	public static void display() {
		if(top==null) {
			System.out.println("Stack is UnderFlow");
			return;
		}
		Node temp = top;
		while(temp.next!=null) {
			System.out.println(temp.data+" ");
				temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void push(int data) {
		Node newNode = new Node(data);
		if(top==null) {
		top = newNode;
		size++;
		return;
		}
		newNode.next = top;
		top = newNode;
		size++;
	}
}
















