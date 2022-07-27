package linkedList;

// LinkedList With O(1) complexity
public class LinkedListWithO1 {
	static Node head;
	static Node tail;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		LinkedListWithO1 list = new LinkedListWithO1();
	
		addLast(100);
		display(list);
		
		addFirst(1);
		addFirst(2);
		addFirst(22);
		
		addLast(77);
		display(list);
		deleteFirst();
		deleteFirst();
		addFirst(10);

		display(list);

	}

	
	
	
	public static void deleteFirst() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
			tail = null;
			return;
		}
		head = head.next;

	}

	public static void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public static void addLast(int data) {

		Node newNode = new Node(data);
		newNode.next = null;
		if(head==null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
	}

	public static void display(LinkedListWithO1 list) {
		if (list.head == null) {
			System.out.println("NULL");
		}

		Node curr = list.head;
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("NULL");

	}

}
