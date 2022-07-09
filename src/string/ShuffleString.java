package string;

import java.util.Arrays;

public class ShuffleString {

	public static void main(String[] args) {
	
		String str1 = "geekforgeeks";
		String str2 = "ekegorfkeegsgeek";

		boolean result = shuffle(str1, str2);
		
		if(result) {
			System.out.println("Shuffled ");
		}else {
			System.out.println("Not Shuffled");
		}
	}

	public static boolean shuffle(String s1, String s2) {
		
		boolean shuffle = true;
		
		if(s1.length()>s2.length()) {
			shuffle=false;
			return shuffle;
		}else{
			
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
				
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			String temp1 = String.valueOf(c1);
			String temp2 = String.valueOf(c2);
			
			if(!temp2.contains(temp1)) {
				shuffle = false;
			}
			
		}
		return shuffle;
	}

}
