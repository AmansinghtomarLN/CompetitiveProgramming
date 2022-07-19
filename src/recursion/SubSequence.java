package recursion;

import java.util.ArrayList;

public class SubSequence {
/*
	No. of  subsequence = No.of choice ^ no. of characters
	abc = 2^3
	choice = yes or not ?? include or not include
	*/
	
	public static void main(String[] args) {
		
		String s = "abc";
		ArrayList<String> result = subSequence(s);
		
		System.out.println(result);
	}
	
	
	public static ArrayList<String> subSequence(String s){
		
		if(s.length()==0) {
			ArrayList<String> subSequ = new ArrayList<String>();
			subSequ.add("");
			return subSequ;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		
		ArrayList<String> reros = subSequence(ros);
		
		ArrayList<String> subSequence = new ArrayList<String>();
		for(String add:reros) {
			subSequence.add(""+add);
			subSequence.add(ch+add);
		}
		
		
		
		
		return subSequence;
	}
	
}
