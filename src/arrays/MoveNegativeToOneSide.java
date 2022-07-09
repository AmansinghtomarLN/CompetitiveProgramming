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
		
		int l = 0;
		int r = n-1;
		int count = 0;
		while(l!=r) {
			count++;
			if(a[l]<0 && a[r]>0){
			System.out.println("First");
				l++;
				r--;
			}else if (a[l]>0 && a[r]<0) {
				System.out.println("Second");
				swap(l, r, a);
				l++;
				r--;
			}else if (a[l]<0 && a[r]<0) {
				System.out.println("Third");
				l++;
			}else {
				System.out.println("tomar");
			}	}
		for(int i:a) {System.out.print(i+  " ");}
	}
	
	public static void swap(int i, int j, int[] a) {
		int temp = 0;
		temp = a[i];
		a[i]= a[j];
		a[j] = temp;
		
	}
	
}
















