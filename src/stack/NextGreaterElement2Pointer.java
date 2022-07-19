package stack;

import java.util.Stack;

public class NextGreaterElement2Pointer {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
		long[] arr1 = new long[] { 2, 5, 9, 3, 1, 12, 6, 8, 7 };
		nextGreaterElementNonOptimized(arr);
		nextLargerElement(arr1,arr.length);
	}
	
	// optimized solution
	
	 public static long[] nextLargerElement(long[] a, int n)
	    { 
	    long[] nge = new long[n];
	    Stack<Long> stack = new Stack<Long>();
	    stack.push(a[n-1]);
	    nge[n-1] = -1;
	    
	    for(int i =n-2; i>=0;i--){
	        while(stack.size()>0 && a[i]>=stack.peek()){
	            stack.pop();
	        }
	        if(stack.size()==0){
	            nge[i] = -1;
	        }else{
	            nge[i] = stack.peek();
	        }
	        stack.push(a[i]);
	    }
	    
	return nge;    } 

	
	
	
	// Not an optimized solution
	public static void nextGreaterElementNonOptimized(int[] a) {
		long[] result = new long[a.length];
		int j = 1;
		int greater = -1;

		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.println("Greater Element for " + a[i] + " " + "is -1");
				result[i] = -1;
				break;
			}
			if (a[i] < a[j]) {
				System.out.println("Greater Element for " + a[i] + " " + "is " + a[j]);
				result[i] = a[j];
				j++;
			} else {
				while (a[i] > a[j]) {
					j++;
					if (j == a.length) {
						System.out.println("Greater Element for " + a[i] + " " + "is -1");
						result[i] = -1;
						break;
					}
				}
				if (j < a.length) {
					System.out.println("Greater Element for " + a[i] + " " + "is " + a[j] + " ");
					result[i] = a[j];
				}
				j = i + 2;

			}
		}
	}

}
