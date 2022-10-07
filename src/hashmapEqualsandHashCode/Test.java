package hashmapEqualsandHashCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) {
		
	String s= "eadfcaeb";	 // e
	String s1 = "aeeb";
	String s2 = "abcfgdcddc";
		
//System.out.println(	getLeftMostChar(s));
System.out.println(getLeftMostChar(s2));



	BlockingQueue<Integer> qu = new ArrayBlockingQueue<Integer>(2);
	
	try {
		
		System.out.println("df"+qu.take());
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	static char  getLeftMostChar(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int max =0;
		char lemost = 0;
		for(int i =0; i<str.length();i++) {
			
			
			if(map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
		//	max = 	map.get(str.charAt(i))+1;
			if(map.get(str.charAt(i))+1>=max){
				max = map.get(str.charAt(i))+1;
				lemost = str.charAt(i);
		//		System.out.println(lemost);
			}
			}else {
				map.put(str.charAt(i),1); 
				
			}
			
			
		}
		
		// 
		if(max==0) {return str.charAt(0);}
		
		return lemost;
	}
	
	
	
}
