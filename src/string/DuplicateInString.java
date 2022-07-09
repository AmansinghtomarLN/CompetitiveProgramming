package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateInString {

	public static void main(String[] args) {
		
		String input = "geeksforGeeks";
		duplicate(input.toLowerCase());
	}
	
	public static void duplicate(String s) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i =0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> pMap : map.entrySet()) {
			if(pMap.getValue()>1) {
				System.out.print(pMap.getKey()+ " ");
			}
		}

	}
	
	
}
