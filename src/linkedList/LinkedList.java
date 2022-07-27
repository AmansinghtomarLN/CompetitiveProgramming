package linkedList;

/*
head==null
head.next==null // delete first  -> list can have only one node

 */

public class LinkedList {
	static Node head;
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

		LinkedList list = new LinkedList();

		addLast(10); // 10
		addFirst(35); // 20 10
		addFirst(10); // 30 20 10 
		addLast(40); // 30 20 10 40
		addFirst(25);
		addFirst(35);
		addFirst(15);
		printList(list);
	
		// reverseListThroughRecursion(list);
		printList(list);
		
	//	removeDuplicates(list.head);
	//	printList(list);
		
	//	moveLastToFront();
	//	printList(list);
		
	
		
		
/*		
		deleteElementFromLast(3);
		deleteElementFromLast(3);
		
		printList(list);
		
	//	reverseList(list);
		
	//	deleteFirst(); // 20 10 40 
		deleteLast(); // 20 10 
	//	deleteFirst(); //  10 40 
		printList(list);

//		printList(list);
	*/
	}
	
	
	// deleting element from sorted list
	public static Node removeDuplicates(Node head) {
	Node temp  = head;
	Node pre = null;
	while(temp.next!=null){
	
	    pre = temp;
	    temp = temp.next;
	    if(pre.data==temp.data){
	        pre.next = temp.next;
	        temp.next = null; // removing duplicate node 
	        temp = pre;
	        size--;
	    }
	}
	return head;
    }
	
	/*
	 * For example, the number 190 will be represented by the linked list, 1->9->0->null, similarly 25 by 2->5->null. 
	 * Sum of these two numbers is 190 + 25 = 215, which will be represented by 2->1->5->null. You are required to return the head of 
	 * the linked list 2->1->5->null.
	 * */
	
	
	  //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        
        
        int sum = 0;
        int sum1 = 0;
        int count = 10;
        while(first!=null){
            sum = sum*count+first.data;
            first = first.next;
        }
        count = 10;
        while(second!=null){
            sum1 = sum1*count+second.data;
            second = second.next;
        }

        int r = sum+sum1;
        
        Node result;
        Node head;
        Node pre  = null;;
        while(r%10!=0){
            result = new Node(r/10);
            result.next = pre;
            pre = result;
            head = result;
            r = r/10;
        }

        result = new Node(r);
            result.next = pre;
            pre = result;
            head = result;
        
        //Node result = new Node();
        
       return head;
    }
	
	public static void moveLastToFront() {
		Node current = head;
		Node pre = null;
		
		while(current.next!=null) {
		pre = current;
		current =current.next;
		}
		current.next = head;
		head = current;
		pre.next = null;
		
		
	}

	// delete and show kth element from the last 
	
	public static int deleteElementFromLast(int index) {
		int count = 0;
		int value = -1;
		Node current = head;
		while(current!=null) {
			count++;
			current = current.next;
			if(count==size-index-1) {
				value = current.next.data;
				current.next = current.next.next;
				size--;
				System.out.println("deleted : "+value);
				break;
			}
			
		}
		
		return value;
	}
	
	// Iterative
	public static void reverseList(LinkedList list) {
		Node pre = null;
		Node next = null;
		Node current = list.head;
		
		while(current!=null) {	
			next = current.next;
			current.next=pre;
			pre = current;
			current = next;
		}
		head = pre;
		printList(list);		
	}
	
	// Recursion
	public static void reverseListThroughRecursion(LinkedList list) {
		if(list.head==null) {
			return;
		}
		
		
		Node current = list.head;
		Node next = current.next;
		Node pre = current;
		list.head = next;
		reverseListThroughRecursion(list);		
		list.head = pre;
		current= list.head;
		current.next = pre;
	
	}
	
	
	
	
	
	public static void addFirst(int data) {

		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		size++;
		
	}

	public static void deleteFirst() {
		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			head = head.next;
			size--;
		}
		
	}
	
	public static void deleteLast() {

		if(head==null) {
			System.out.println("LinkedList is empty");
		}else {
			
			// when linkedlist has only 1 element
			if(head.next==null) {
				head = null;
				size--;
				return;
			}

			Node secondLast = head; // first pointer to track second last node
			Node lastNode = head.next; // second pointer to track last node
			while (lastNode.next != null) { // for reaching to last node of the list
				lastNode = lastNode.next;
				secondLast = secondLast.next;	
			}
			secondLast.next = null;
			size--;
		}
		}

	
	
	public static void addLast(int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (head == null) {
			head = newNode;
			size++;
		} else {
			Node last = head;
			while (last.next != null) { // for reaching to last node of the list
				last = last.next;
			}
			last.next = newNode;
			size++;
		}
	}

	public static void printList(LinkedList list) {
		if (list.head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}

		Node currentNode = list.head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println(" NULL "+ "Size : "+size);
	}

}
