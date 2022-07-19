package linkedList;

public class DoublyLinkedList {

	Node head;

	private class Node {

		int data;
		Node next;
		Node pre;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node next, Node pre) {
			this.data = data;
			this.next = next;
			this.pre = pre;
		}
	}
	
	public static void main(String[] args) {

		DoublyLinkedList ll = new DoublyLinkedList();
		ll.insertLast(100);
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(40);
		
		ll.insertFirst(30);
		ll.display();

	}

	public void insertAtIndex(int index, int element) {
		
		
		
	}
	
	public void insertFirst(int element) {

		Node newNode = new Node(element);
		newNode.next = head; // if list is having more than 1 node -> it will point to second node
		newNode.pre = null;

		if (head != null) {
			head.pre = newNode;
		}
		head = newNode;
	}
	
	
	public void insertLast(int element) {

		Node newNode = new Node(element);
		
		if(head==null) {
			newNode.pre = null;
			head = newNode;
			return;
		}
		Node temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
			newNode.pre = temp;
			newNode.next = null;
			temp.next=newNode;
	}

	public void display() {
		Node temp = head;
		Node tail = null;

		while (temp != null) {
			System.out.print(temp.data + "->");
			tail = temp;
			temp = temp.next;
		}
		System.out.println();
		System.out.println("Printing in Reverse");
		while (tail != null) {
			System.out.print(tail.data + "->");
			tail = tail.pre;
		}
		System.out.println();
	}

	public void displayReverse() {

	}



}
