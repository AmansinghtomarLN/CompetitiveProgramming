package linkedList;


/*
head==null
head.next==null // delete first  -> list can have only one node

 */


public class LinkedList {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		addLast(10); // 10
		addFirst(20); // 20 10
		addFirst(30); // 30 20 10 
		addLast(40); // 30 20 10 40
		deleteFirst(); // 20 10 40 
		deleteLast(); // 20 10 
	//	deleteFirst(); //  10 40 
		printList(list);

//		printList(list);

	}


	
	public static void addFirst(int data) {

		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		
	}

	public static void deleteFirst() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			head = head.next;
		}
		
	}
	
	public static void deleteLast() {

		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			
			// when linkedlist has only 1 element
			if(head.next==null) {
				head = null;
				return;
			}

			Node secondLast = head; // first pointer to track second last node
			Node lastNode = head.next; // second pointer to track last node
			while (lastNode.next != null) { // for reaching to last node of the list
				lastNode = lastNode.next;
				secondLast = secondLast.next;	
			}
			secondLast.next = null;
		}
		}

	
	
	public static void addLast(int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) { // for reaching to last node of the list
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public static void printList(LinkedList list) {
		if (list.head == null) {
			System.out.println("LinkedList is Empty");
		}

		Node currentNode = list.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println(" NULL ");
	}

}
