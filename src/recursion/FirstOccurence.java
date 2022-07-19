package recursion;

public class FirstOccurence {

	public static int temp =0;
	public static int count = 0;
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2,3,4,5,3,6,8,2};
		int data = 2;
		System.out.println("first occurence of "+ data+ " is : "+firstOccurence(arr, 0, data));
		
	}
	
	
	public static int firstOccurence(int[] a, int index, int data) {
		
		if(index==a.length) {return -1;}
		
		if(a[index]==data)
		{count++;
			if(count==2) {
				System.out.println("second occurence of "+ data+ " is "+ index);
				return temp;
				}
		temp = index;
		}
		
		return firstOccurence(a, index+1, data);
	}
}
