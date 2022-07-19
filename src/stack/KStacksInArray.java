package stack;

public class KStacksInArray {

	int[] arr;
	int[] top;
	int[] next;
	
	int k,n;
	
	int freeSpace;
	public KStacksInArray(int K, int N) {
		k = K;
		n = N;
		arr = new int[n];
		top = new int[k];
		next = new int[n];
	
		// 1. Initializing Top{}
		for(int i = 0; i<top.length;i++) {
			top[i] = -1;
		}
	
		// 2. Initializing next[]
		for(int i=0; i<next.length;i++){
			next[i] = i+1;
		}
		// Update last index of next[]
		next[next.length-1] = 1;
		// Update Initialial free index
		freeSpace = 0;
	}
	

	public static void main(String[] args) 
    {
        // Let us create 3 stacks in an array of size 10
        int k = 3, n = 10;
          
        KStacksInArray ks = new KStacksInArray(k, n);
  
        ks.push(15, 2);
        ks.push(45, 2);
  
        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);
  
        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);
  
        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));
    }
	
	public  void push(int element, int sn) {
		
		if(freeSpace==-1) {
			System.out.println("Stack os UnderFlow");
			return ;
		}
		
		// 1. Find Index
		int index = freeSpace;
		 
		// 2. Update FreeSpace
		freeSpace= next[index];
		
		// 3. Insert in Array
		arr[index] = element;

		// 4. Update Next[]
		next[index] = top[sn-1];
		
		// 5. Update Top
		top[sn-1] =index; 
	}
	
	
	public int pop(int sn) {
		if(isEmpty(sn)) {
		System.out.println("Stack is Empty");	
		return  -1;
		}
		
		int i  = top[sn-1];
		top[sn-1] = next[i];
		next[i] = freeSpace;
		freeSpace= i;
        return arr[i];
	}
	public boolean isEmpty(int sn) {
		if(top[sn-1]==-1) {
			return true;
		}
		return false;
	}
	
}

















