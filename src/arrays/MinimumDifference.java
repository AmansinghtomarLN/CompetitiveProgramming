package arrays;

import java.util.Arrays;

public class MinimumDifference {

	public static void main(String[] args) {
	
//		int Arr[] = {3, 9, 12, 16, 20};
//		int Arr[] = {1, 5, 8, 10};
		int Arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		Arrays.sort(Arr);
		
		for(int i : Arr ) {System.out.println(i);}
		int k = 5;
		difference(Arr, k);
		
	}
	
	
	
	public static int difference(int [] a, int k ) {
		
		for(int i =0; i<a.length; i++) {
			if(a[i]-k>0) {
				a[i] = a[i]-k;
			}else {
				a[i] = a[i]+k;
			}
		}
		
		Arrays.sort(a);
		System.out.println(a[a.length-1]-a[0]);
	return	a[a.length-1]-a[0];
	}
}
