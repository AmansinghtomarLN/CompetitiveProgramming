package string;

public class StringRotationOfOther {

public static void main(String[] args) {
	
	
	 String str1 = "AACD";
     String str2 = "ACDA";
     
     rotation(str1, str2);
}

	public static void rotation(String s1, String s2) {
		boolean result = true;
	
		String temp = s1+s1;
		if(!temp.contains(s2)) {
			result = false;
		}
		if(result) {
			System.out.println("Yes, Rotation of String");
		}else {
			System.out.println("No, Rotation of String");
		}
	}
}
