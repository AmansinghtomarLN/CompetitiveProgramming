package linkedList;

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
		LinkedList l1 = insert(list, 10);
		
		System.out.println(l1.head);
		
		insert(list, 20);
		printList(list);

	}

	public static LinkedList insert(LinkedList list, int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) { // for reaching to last node of the list
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	public static void printList(LinkedList list ) {
		 	Node currentNode = list.head;
		 while(currentNode!=null) {
			 System.out.println(currentNode.data);
			 currentNode= currentNode.next;
		 }
		 
		
	 }

}
