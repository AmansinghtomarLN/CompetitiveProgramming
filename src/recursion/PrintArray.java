package recursion;

public class PrintArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
	///	print(array,0);
		printReverse(array,0);
	}
	
	
	public static void print(int[] a, int start) {
		if(start==a.length) {
			return;
		}
		
		System.out.println(a[start]);
		print(a, start+1);
	}
	
	
	public static void printReverse(int[] a, int start) {
		if(start==a.length) {
			return;
		}
		
		printReverse(a, start+1);
		System.out.println(a[start]);

	}
}
