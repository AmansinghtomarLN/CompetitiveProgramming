package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SubString {

	public static void main(String[] args) {
		String str = "abccbc";
	//	subString(str);
	ArrayList<String> palindromeString = 	palindromicSubString(str);
	//Collections.sort(palindromeString);
	
	Collections.sort(palindromeString, (a, b)->Integer.compare(a.length(), b.length()));

	System.out.println("longest palindrome : "+palindromeString.get(palindromeString.size()-1));

	}
	
	
	public static void subString(String s) {
	int count = 0;
		for(int i =0;i<s.length();i++) {
			for(int j =i+1; j<=s.length();j++) {
				count++;
				System.out.println(s.substring(i,j));
			}
		}
		System.out.println(count);
	}
	
	public static ArrayList palindromicSubString(String s) {
		ArrayList<String> al = new ArrayList<String>();
		for(int i =0; i<s.length();i++) {
			for(int j =i+1; j<s.length();j++) {
				String sStr = s.substring(i,j);
				if(isPalindrome(sStr)==true) {
					al.add(sStr)
;					System.out.println(sStr);
				}
			}
		}
		return al;
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		return true;
	}
	
	
}
