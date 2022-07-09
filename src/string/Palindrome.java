package string;

public class Palindrome {

	public static void main(String[] args) {
		String input = "abdcba";
		palindrome(input);
	}

	public static void palindrome(String s) {
		boolean palindrome = true;
		for (int i = 0, j = s.length() - 1; i <= s.length() / 2 && j >= s.length() / 2; i++, j--) {
	//		System.out.println("i : "+ i +"& j : "+ j);
			if (s.charAt(i) != s.charAt(j)) {
				palindrome = false;
				break;
			}
		}
		if (palindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
