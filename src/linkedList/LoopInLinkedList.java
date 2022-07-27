package linkedList;

import linkedList.LinkedList.Node;

public class LoopInLinkedList {
	static Node head;
	static Node tail;
	static Node loopNode;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		LoopInLinkedList list = new LoopInLinkedList();
		add(10);
		add(20);
		add(30);
		add(5);
		add(1);
		
		printList(list);
		
		createLoop(20);
		
		detectLoop(list);

		 Node start = deleteLoopNode(); // deleting loop and returning start point of the loop
		System.out.println(start.data);
		detectLoop(list);
		//	printList(list);
		

	}
	
	// create loop if value is 20
	public static void createLoop(int value) {
		Node current = head;
		Node startLoopNode = null;
		
		while(current.next!=null) {
			if(current.data==value) {
				startLoopNode = current;
			}
			current = current.next;
			
		}
		current.next = startLoopNode;
		
		
	}

	public static Node deleteLoopNode() {
		LoopInLinkedList list = new LoopInLinkedList();
		Node meet = detectLoop(list);
		Node start = list.head;
		Node pre = null;
		if(meet!=null){
				while(start!=meet) {
					start = start.next;
					pre = meet;
					meet = meet.next;
				}
				System.out.println("Loop start from here at :"+ start.data);
				
				pre.next=null;
				return start;
				// delete loop
		}
		return null;
	}
	
	
	public static Node detectLoop(LoopInLinkedList list) {

		Node current = list.head;
		Node slow = list.head;
		Node fast = list.head;

		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 step at a time
			fast = fast.next.next; // 2 step at a time
			if (slow == fast) {
				System.out.println("Loop Exists");
				return slow;
			}

		}
		System.out.println("Loop does not exists");
		return null;
	}

	public static void add(int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(head==null) {
			head = newNode;	
			tail = newNode;
			return ;
		}
		tail.next = newNode;
		tail = newNode;
		
	}
	
	public static void printList(LoopInLinkedList list) {
		if (list.head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node currentNode = list.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println(" NULL ");
	}	
	
}







