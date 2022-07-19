package stack;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {

		int[][] celebrity = new int[][] { { 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0 } };
		int[][] celebrity1 = new int[][] { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
		int[][] celebrity2 = new int[][] { { 0, 1 }, { 1, 0 } };

		testContinue();
		System.out.println();
		
		 System.out.println(celebrity(celebrity));
		 System.out.println(celebrity(celebrity1));
		System.out.println(celebrity(celebrity2));

	}

	public static void testContinue() {
		for(int i = 0;i<3;i++) {
			System.out.println(i);
			if(i==1) {
				continue;
			}
			System.out.println("A:"+i);
		}

	}
	
	// Optimized using Stack
	 int celebrity(int a[][], int n)
	    {
	    	Stack<Integer> stack = new Stack<Integer>();
	    	for(int i =0; i<a.length;i++){
	    	    stack.push(i);
	    	}

	    	while(stack.size()>=2){
	    	    int i  =stack.pop();
	    	    int j = stack.pop();
	    	    
	    	    if(a[i][j]==1){
	    	        // if i knows j -> i is not a celebirty
	    	        stack.push(j);
	    	    }else{
	    	        // if i does not know j -> is is a celebrity;
	    	        stack.push(i);
	    	    }
	    	    
	    	}
	    	int pot = stack.pop();
	    
	    for(int i=0; i<a.length;i++){
	        if(i!=pot){
	            if(a[i][pot]==0 || a[pot][i]==1){
	                pot  = -1;
	                return pot;
	            }
	        }
	    }    	
	    	return pot;
	    }
	
	// Not an optimized solution
	public static int celebrity(int[][] a) {
		int minRow = 0;
		int minCol = 0;
		int maxRow = a.length - 1;
		int maxCol = a[0].length - 1;
		int celebrity = -1;
		for (int r = 0; r < maxRow; r++) {
			for (int c = minCol; c < maxCol; c++) {
				if (r == c) {
					continue;
				}
				if (a[r][c] == 0) {
					celebrity = r;
				} else {
					celebrity = 1 - 2;
					break;
				}
			}
			if (celebrity != -1) {
				break;
			}
		}
		if (celebrity == -1) {
			return celebrity;
		}

		System.out.println(celebrity);
		for (int r = celebrity; r < celebrity + 1; r++) {
			for (int c = minCol; c < maxCol; c++) {
				if (r == c) {
					continue;
				}
				if (a[r][c] != 0) {
					{
						celebrity = 1 - 2;
						break;
					}
				}
			}

		}
		return celebrity;
	}
}
