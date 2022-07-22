package slidingWindow;

import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegativeInWindowOfSizeK {

	public static void main(String[] args) {

		int[] arr = new int[] { 12, -1, -7, 8, -15, 30, 13, 28 };
		int k = 3;
		
		firstNeativeOfAllSubArray(arr, k);
	}

	
	
	public static void firstNeativeOfAllSubArray(int[] a, int k ) {
		
		int i =0;
		int j =0;
		int nge = -1;
		int count = 0;
		boolean remove;
		Queue<Integer> queue = new ArrayDeque<>();
		while(j<a.length) {
			count = 0;
			queue.add(a[j]);
			remove = false;
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				count++;
				
				while(queue.peek()>0) {
					queue.remove();
					remove = true;
				if(queue.size()==0) {break;}
				}
				
				if(count==3) {
				nge = 0;
				}else {
					nge = queue.size()==0?0:queue.peek();
				}
				if(!remove && queue.size()!=0) {
					queue.remove();	
				}
				
				System.out.print(nge+" ");
				i++;j++;
			}
			
		}
		
		
	}
	
	
}
