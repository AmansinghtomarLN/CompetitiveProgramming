package arrays;

import java.io.*;
import java.util.*;


// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1/?page=1&category[]=Arrays&sortBy=submissions#

public	class DuplicatesInArrayUsingHashMap{

	
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            int[] a = new int[n];
	            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
	            Solution1 g = new Solution1();
	            ArrayList<Integer> ans = g.duplicates(a, n);
	            for (Integer val : ans) System.out.print(val + " ");
	            System.out.println();
	        }
	    }
	}
	// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {

        Set<Integer> set = new HashSet<>();
        
        for(Integer i:arr){
            set.add(i);
        }

int temp = 0;
ArrayList<Integer> al = new ArrayList<>();
    
Iterator it = set.iterator();

while(it.hasNext()){
    Integer result = (Integer)it.next();
for(int i =0; i<arr.length; i++){
    if(arr[i]==result){
        temp++;
    }
    
}if(temp>1){al.add(result);}
temp = 0;
}
    if(al.size()==0){ al.add(-1);}
    Collections.sort(al);
    return al;
    }
}

	


class Solution1 {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
System.out.println("size"+arr.length);
    	for(int a:arr){
    		System.out.println(a);
    	}// code here

        ArrayList<Integer> ans=new ArrayList<>();

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){

            if(hm.containsKey(arr[i]))

            hm.put(arr[i],hm.get(arr[i])+1);

            else

            hm.put(arr[i],1);

        }
        
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());

        for(Map.Entry<Integer,Integer> map:hm.entrySet()){

            if(map.getValue()>1)

            ans.add(map.getKey());

        }

     if(ans.size()==0)

     ans.add(-1);

    Collections.sort(ans);

    return ans;

    }

    }
