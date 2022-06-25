package arrays;

public class KadaneAlgorithm {

	// maximum sum of contigious array containing +ive/-ive number
	
	public static void main(String[] args) {
		
//		int array[] = {-1, 4, -2, 5, -5, 2, -20, 6};
//		int array[] = {-1,-2,-3,-4};
		int array[] = {1,2,3,4};
		
		
		maxSum(array,array.length);
	}
	
	public static int  maxSum(int a[], int n){
        int max=a[0]; // incase for array having all negative number
        int curr=0;
       for(int i =0; i<n; i++){
           curr = curr+a[i];
           if(curr>max){
               max = curr;
           }
           if(curr<0){
               curr=0;
           }
       }
       System.out.println(max);
        return max;
    }	
	
}
