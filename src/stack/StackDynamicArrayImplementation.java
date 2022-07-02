package stack;

public class StackDynamicArrayImplementation {

	
	static int capacity;
	static int[] stack;
	static int index =0;
	static int top;
	public StackDynamicArrayImplementation() {
		this.capacity=5;
		stack= new int[capacity];
	}
	
	public static void main(String[] args) {
		
		StackDynamicArrayImplementation stack = new StackDynamicArrayImplementation();
		stack.isEmpty();
	
		stack.push(10);
		stack.size();		
		
		stack.push(20);
		stack.isEmpty();
		stack.size();
		
		stack.push(30);
		stack.push(40);
		stack.size();
		
		stack.push(50);
		stack.push(60);
		stack.size();
		
		stack.pop();
		stack.size();
		
		stack.pop();
		stack.pop();
		stack.size();
		
		stack.pop();
		stack.isEmpty();
		
		stack.peek();
		stack.size();
	}
	
	public static void push(int element) {
		if(index==capacity) {
			
			capacity = 2*capacity;
			
			int [] newStack = new int[capacity];
			for(int i=0;i<stack.length;i++){
	            newStack[i] = stack[i];
	        }
			stack = newStack;
					}
		stack[index] = element;
		System.out.println("pushing "+ element);
		index++;
	}
	
	
	public static void pop() {
		if(index==0) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("popping " +stack[index-1]);
		index--;
	}
	
	
	
	public static void peek() {
		if(index==0) {
			System.out.println("Stack is Empty");
		return;
		}
		System.out.println("Peeking "+ stack[index-1]);
	
	}
	
	public static void size() {
		if(index==0) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Size of Stack is " +  (index) );
	}
	
	public static boolean isEmpty() {
		if(index==0) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("Stack is not Empty");
		}
		return index==0;
	}
	
}
