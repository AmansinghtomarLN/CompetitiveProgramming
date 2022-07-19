package recursion;

public class Permutation {

	
	public static void main(String[] args) {
		
		permutation("abc","");
	}
	
	
	
	public static void permutation(String s, String asf) {
		if(s.length()==0) {
			System.out.println(asf);
		return;
		}

		for(int i=0; i<s.length(); i++) {
//			System.out.println(i);
			char c = s.charAt(i);
			String lpart = s.substring(0,i);
			String rpart = s.substring(i+1);
			String remString = lpart+rpart;
			permutation(remString, asf+c);
		}
		
	}
}
