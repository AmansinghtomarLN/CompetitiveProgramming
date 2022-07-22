package slidingWindow;

public class MaxSubArrayOfSize {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 4, 2, 10, 23, 3, 1, 0, 20 };

		int maxValue = maxSumSubArray(arr, 4);
		System.out.println(maxValue);

		int minValue = minSumSubArray(arr, 2);
		System.out.println(minValue);

	}

	public static int maxSumSubArray(int[] a, int k) {
		int max = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		while (j < a.length) {
			sum = sum + a[j];

			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) { // got the window size
				max = sum > max ? sum : max;
				sum = sum - a[i];
				i++;
				j++;
			}
		}

		return max;
	}

	public static int minSumSubArray(int[] a, int k) {
		int min = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		int windowCount = 0;
		while (j < a.length) {
			sum = sum + a[j];

			if (j - i + 1 < k) {
				j++;
			} else if (j - i + 1 == k) {
				windowCount++;
				if(windowCount==1) {
					min = sum;
				}
				min = sum < min ? sum : min;
				sum = sum - a[i];
				i++;
				j++;
			}
		}
		return min;
	}

}
