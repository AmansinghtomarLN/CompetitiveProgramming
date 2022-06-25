package arrays;

import java.util.ArrayList;
import java.util.Stack;

public class KthLargestInArray {

	public static void main(String[] args) {
		
	//	int[] array = {30,7,10,4,3,20,15};
		int[] array = {7,10,4,3,20,15};

		kLargestElement(array,array.length, 3);
	}
	
	
	public static int  kLargestElement(int[] a, int n, int k) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(a[0]);
		ArrayList<Integer> al = new ArrayList<>();
		int i =1;

		do {
			if(a[i]<stack.peek()) {
				while(a[i]<stack.peek() ) {
					al.add(stack.pop());		
					if(stack.size()==0) {break;}
				}
				}
			stack.push(a[i]);
			for(int j=al.size()-1; j>=0;j--) {
				stack.push(al.get(j));
				al.remove(j);
			}
			
			i++;
		}while(i<n);
		System.out.println(stack);
		System.out.println(stack.elementAt(k-1));
		return stack.elementAt(k-1);
	}
	
}
