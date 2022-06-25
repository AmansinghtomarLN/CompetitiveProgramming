package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegativeToOneSide {

	public static void main(String[] args) {
		
		  int[] arr = { -12, 11, 3, -5, 6, -7, 5, -3,-6 };
		  
		  //Output: -12 -13 -5 -7 -3 -6 11 6 5
		  
		  move(arr, arr.length);

	}
	
	public static void move(int[] a, int n) {
		ArrayList<Integer> al  = new ArrayList<>();
		for(int i =0; i<n;i++) {
			if(a[i]>0) {
				al.add(i);
			}
			
		}
		
	}
	
}
