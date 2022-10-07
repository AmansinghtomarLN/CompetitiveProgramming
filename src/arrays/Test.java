package arrays;

import java.util.Collections;

public class Test {

	
	public static void main(String[] args) {
		int[] arr = new int[]{4,0,4,3,3};
		int k =5;
		System.out.println(findMaxAverage(arr, k));
		System.out.println("Aman");
		
	}
	

		   public static double findMaxAverage(int[] nums, int k) {
		       double sum=0;
		        for(int i=0;i<k;i++)
		            sum+=nums[i];
		        double res=sum;
		        for(int i=k;i<nums.length;i++){
		            sum+=nums[i]-nums[i-k];
		                res=Math.max(res,sum);
		        }
		        return res/k;
		    
	    }
	
	public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        int i =0;
        int j =0;
        int tempI = 0;
        int tempJ=0;
        while(j<nums.length){
            if(k==1){return true;}
            if(j-i+1<k){
                j++;
            }else if (j-i+1==k){
                tempI=i;
                tempJ=j;
                while(tempI<=tempJ){
                    if(nums[tempI]==nums[tempJ]){
                    	
                        return true;
                    }
            tempI++;
                    tempJ--;
                }
                    i++;
                    j++;
            }
            
        }
        return false;
    }
	
	
	
	
	
	
	/*
	applicant- id, name ,jobId
	job -id, title
	
	
	num of application 50>
	
	select jobId from applicant groupby jobId;
	
	select title from job where jobid=()
	
	
	employee - name,gender
	
	query optimization
	
	*/
}
