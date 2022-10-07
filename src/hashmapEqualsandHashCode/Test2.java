package hashmapEqualsandHashCode;



public class Test2 {

	public static void main(String[] args) {
		/*
		Given a characters array letters that is sorted in non-decreasing order and a 
		character target, return the smallest character in the array that is larger than 
		target.
		*/
	    
		/*
			You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
			 and two integers m and n, representing the number of elements in nums1 and nums2
			  respectively.		 * 
			  We have
			  
			  Merge nums1 and nums2 into a single array sorted in non-decreasing order.
		 * 
		 */
		int n = 5;
		int m = 6;
		 int[] num1  = new int[m];  //  [1,2,3,4,8] // 5
		 int[] num2 = 	new int[n]; //  [2,3,5,6,7,9]
		 
		 int [] result = new int[n+m];
		 int temp = 0;
		 
		 // two pointer 
				 
			int first = 0;
		 	int second = 0;
		 	int  m1 =0;
		 	
		 
		 	
	while(m1<num1.length) {
		 	
		 	if(num1[first]<num2[second]) {
		 		result[temp] = num1[first];
		 		temp++;
		 		first++;
		 		m1++;
		 		
		 	}else if (num1[first]>num2[second]) {
		 		result[temp] = num2[second];
		 		temp++;
		 		second++;
		 	}else if(num1[first]==num2[second]) {
		 		result[temp] = num1[first];
		 		first++;
		 		temp++;
		 		m1++;
		 	}
		 	}
			
	if(num2.length>num1.length) {
		 	while(n<num2.length) {
		 		result[temp] = num2[second];
		 		second++;
		 		m++;
		 	}
	}else {	
		 	while(m<num1.length) {
		 		result[temp] = num1[second];
		 		first++;
		 		m++;
		 	}
			
	}
				 
				 
				 

		
	}
	
}
