package recursion;

public class LastOccurence {

	public static int temp =0;
	public static int count = 0;
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2,3,4,5,3,6,8,2,8};
		int data = 8;
		System.out.println("last occurence of "+ data+ " is : "+lastOccurence(arr, 0, data));
		
	}
	
	
	public static int lastOccurence(int[] a, int index, int data) {
		
		if(index==a.length) {return temp;}
		
		if(a[index]==data)
		{
		temp = index;
		}
		
		return lastOccurence(a, index+1, data);
	}
	
}
