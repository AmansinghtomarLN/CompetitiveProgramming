package slidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class MaximumOfAllSubArrayOfSizeK {

	public static void main(String[] args) {

		//int[] arr = new int[] { 6, 4, 2, 1, 23, 3, 1, 0, 20 };
		int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
		
		maxOfAllSubArray(arr, 3);
			
	}
	
	//GFG solution
	// GFG Solution
	 static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
	    {
	        ArrayList <Integer> ans = new ArrayList <Integer>();
	        Deque<Integer> q = new ArrayDeque<Integer>();
	        int i = 0;
	        for(; i <k ; i++){
	            if(q.isEmpty())q.addLast(i);
	            else{
	                while(q.size() != 0 && arr[q.peekLast()]<arr[i]){
	                    q.removeLast();
	                }
	                q.addLast(i);
	            }
	        }
	        ans.add(arr[q.peekFirst()]);
	        while(i < arr.length){
	            if(q.isEmpty())q.addLast(i);
	            else{
	                while(q.size() != 0 && arr[q.peekLast()]<arr[i]){
	                    q.removeLast();
	                }
	                q.addLast(i);
	            }
	            while(q.peekFirst() <= i-k){
	                q.removeFirst();
	            }
	            ans.add(arr[q.peekFirst()]);
	            i++;
	        }
	        
	        return ans;
	        
	    }
	

	
	
	// edge case if window size = 1 and a.length
	public static void maxOfAllSubArray(int[] a,int k) {

		int max = 0;
		int i = 0;
		int j = 0;
		Queue<Integer> queue = new ArrayDeque();
		
		while(j<a.length) {
			
			max  = max>a[j]?max:a[j];
			queue.add(a[j]);
			
			if(j-i+1<k) {
				j++;
			}else if (j-i+1==k) {
				System.out.print(max+" ");

				while(queue.remove()==max) {
					max = queue.peek();
					if(queue.size()==0) {
						queue.add(a[i]);
					}
					break;
				}
				
				
					i++;
					j++;
				};
				
			}

		}

	}

