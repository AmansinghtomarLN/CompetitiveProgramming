package arrays;

public class MinimumJump {

	public static void main(String[] args) {

		// int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;

	//	 int[] arr = {1, 4, 3, 2, 6, 7};
		int[] arr = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 }; // 4
		System.out.println("ans " + minimumJump(arr, arr.length));
		;
	}
	
	 static int minJumps(int[] arr){
	     int ans= -1;
	     if( arr.length == 0 ) return ans;
	     if( arr.length==1 ) return 0;
	     int maxReach = arr[0];
	     int jump = 0; 
	     int val = 0; 
	     for( int i = 0 ; i < arr.length ; i++){
	         val = Math.max( val, i+arr[i]); 
	         if( i == maxReach)
	             {   maxReach = val;
	                 jump++;
	             }
	        if( maxReach >= arr.length-1 ) return jump+1;         
	     }
	     return ans;
	    }
	
	public static int minimumJump(int[] a, int n) {
		int i = 0;
		int jump = 0;
		int step = 0;
		int temp = 0;
		int min = 0;
		while (i < n) {
			 if(n==1){return 0;};
			 
			jump = a[i];
			
			if (jump == 0) {
				return -1;
			}
			step++;
			System.out.println("i "+i );
			System.out.println("Step is "+step);
			
			temp = a[i + 1];
			
			if (i + jump >= a.length - 1) {
				break;
			}
			
			for (int j = i + 1; j <= i+jump; j++) {
				if (temp < a[j]) {
					temp = a[j];
				}
			}
			System.out.println("max element near "+ temp);
			for (int j = i + 1; j <= i+ jump; j++) {
				if (temp == a[j]) {
					min = j;
				}
			}
			System.out.println("max element index : " + min);
			
			
//		i = temp + a[min];
			i = min;
			System.out.println("i :"+i +" temp : "+temp+ " a[min] "+ a[min]);
			System.out.println();

		}
		return step;
	}
}
