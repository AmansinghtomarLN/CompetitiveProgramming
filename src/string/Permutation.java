package string;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {
	
	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> permutation = getPermutation(s);
		
		Collections.sort(permutation);
		
		System.out.println(permutation);
		
	}
	public static ArrayList<String> getPermutation(String s){
		
		if(s.length()==0) {
			ArrayList<String> al = new ArrayList<String>();
			al.add("");
			return al;
		}
		
		char ch = s.charAt(0);
		String ros = s.substring(1);
		
		ArrayList<String> preResult = getPermutation(ros);
		
		ArrayList<String> result = new ArrayList<String>();
		
		for(String val:preResult) {
			for(int i =0; i<=val.length();i++) {
				result.add(val.substring(0,i)+ch+val.substring(i));
				}
		}
		
		
		return result;
	}

}
