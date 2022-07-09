package linkedList;

public class CircularLinkedList {

	Node head; 
	Node tail;
	
	
	public static void main(String[] args) {
		
		CircularLinkedList ll = new CircularLinkedList();
		
		ll.insert(10);
		ll.insert(30);
		ll.insert(40);
		ll.display();
		
	}
	
	public void insert(int element) {
		
		Node newNode = new Node(element);
		
		if(head==null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next=newNode;
		newNode.next=head;
		tail = newNode;
		
	}
	
	public void display() {
		
		Node temp = head;
		if(head != null) {
			do {
				System.out.println(temp.data +" -> ");
				temp = temp.next;
			}while(temp!=head);
		}
		System.out.println();
	}
	
	private class Node{
		int data;
		Node next;
		
		public Node(int element) {
			this.data=element;
		}
		
	}
	
	
}
