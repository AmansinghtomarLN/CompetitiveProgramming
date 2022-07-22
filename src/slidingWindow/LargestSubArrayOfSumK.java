package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LargestSubArrayOfSumK {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 1, 1, 1, 2, 3, 4, 5 };
		int sum = 5;
		largestSubArray(arr, sum);
	}

	public static void largestSubArray(int[] a, int s) {
		int i = 0;
		int j = 0;
		int sum =0;
		int maxSum = 0;
		while (j < a.length) {
				sum = sum+a[j];
			if (sum<s) {
				j++;
			}else if(sum>s) {
				sum  = sum-a[i]-a[j];
				i++;
			}else if (sum==s) {
			System.out.println(i+" - "+j);
				maxSum = (j-i+1)>maxSum?j-i+1:maxSum;
				sum  = sum-a[i];
				i++;
				j++;
			}
		}System.out.println(maxSum);
	}
}
