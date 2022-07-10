package recursion;

public class MaxInArray {

	
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,58,77,8};
		
		System.out.println(maxInArray(arr, arr.length-1));
	}
	
	
	public static int maxInArray(int[] a,  int max) {
		if(max==0) {
			return a[max];
		}
		
		return a[max]>maxInArray(a,max-1)?a[max]:maxInArray(a, max-1);
	}
	
}
