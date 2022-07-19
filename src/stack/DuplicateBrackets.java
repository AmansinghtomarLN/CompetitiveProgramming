package stack;

import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		
		String exp1 = "((a+b)+(c+d))";
		String exp2 = "(a+b)+((c+d))";
		System.out.println(duplicateBrackets(exp1));
		System.out.println(duplicateBrackets(exp2));
	}

	public static boolean duplicateBrackets(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ')') {
				stack.push(s.charAt(i));
			} else {
				if (stack.peek() == '(') {
					return true;
				}
				while (stack.peek() != '(') {
					stack.pop();
				}
				stack.pop();
			}
		}
		return false;
	}

}
