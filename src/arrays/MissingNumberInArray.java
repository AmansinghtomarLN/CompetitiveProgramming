package arrays;

public class MissingNumberInArray {

	// Input:
	// N = 10
	// A[] = {6,1,2,8,3,4,7,10,5}
	// Output: 9

	public static void main(String[] args) {
		int missingNumber = missingNumber(new int[] { 1, 2, 4, 5 }, 5);
	//	System.out.println(missingNumber);
	System.out.println(sum(10));
//	System.out.println(sum(10.0));
	}
	
	
	
	public static float sum(float f) {System.out.println("float");return  f;};
	public static long  sum(long f) {System.out.println("long");return  f;};

	public static int missingNumber(int array[], int n) {

		
		
		int sum = n * (n + 1) / 2;

		for (int i : array) {
			sum = sum - i;
		}
		return sum;
	}

}
