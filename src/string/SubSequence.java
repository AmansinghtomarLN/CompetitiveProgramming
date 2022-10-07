package string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class SubSequence {

	public static void main(String[] args) {

		String sub = "abcd";
		ArrayList<String> subSequence = subSequence(sub);
		System.out.println(subSequence);

		for(String s : subSequence) {
			if(SubString.isPalindrome(s) && s.length()>=1) {
				System.out.print(s+", ");
			}
		}
			
		System.out.println();
		System.out.println(ispar("{(([])}"));
	}

	
	
	
	 static boolean ispar(String s)
	    {
	        boolean result  = true;
	        // add your code here
	        
	        Stack<Character> stack = new Stack<Character>();
	        for(int i =0; i<s.length();i++){
	            char c = s.charAt(i);
	            
	            if(c=='{' || c=='(' || c=='['){
	                stack.push(c);
	            }else{
	                if(c=='}'){
	                        if(stack.peek()=='{'){
	                        stack.pop();
	                     }else{return result = false;}
	                }else if(c==')'){
	                     if(stack.peek()=='('){
	                        stack.pop();
	                     }else{return result = false;}
	                }else{
	                     if(stack.peek()=='['){
	                        stack.pop();
	                     }else{return result = false;}
	                }
	            }
	        }
	        
	        
	        return result;
	    }
	
	public static ArrayList<String> subSequence(String s) {
		
		if(s.length()==0) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		}
		
		char c = s.charAt(0);                
		String ros = s.substring(1);         
		
		ArrayList<String> sub = subSequence(ros);
		
		ArrayList<String> result = new ArrayList<>();
		
		for(String ss: sub) {
			
			result.add(""+ss);
			result.add(c+ss);
		}
		
		return result;
	}
}
