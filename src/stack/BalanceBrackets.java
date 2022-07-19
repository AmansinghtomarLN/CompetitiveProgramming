package stack;

import java.util.Stack;

public class BalanceBrackets {

	public static void main(String[] args) {

		String s1 = "[(a + b) + {(c + d) * (e / f)}]"; // true
		String s2 = "[(a + b) + {(c + d) * (e / f)]}"; // false
		String s3 = "[(a + b) + {(c + d) * (e / f)}"; // false
		String s4 = "([(a + b) + {(c + d) * (e / f)}]"; // false
		
		System.out.println(balancedBrackets(s1));
		System.out.println(balancedBrackets(s2));
		System.out.println(balancedBrackets(s3));
		System.out.println(balancedBrackets(s4));
	}

	public static boolean balancedBrackets(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				if (s.charAt(i) == ')') {
					boolean val = closingBrackets(stack, '(');
					if(val==false) {return false;};
				} else if (s.charAt(i) == ']') {
					boolean val = closingBrackets(stack, '[');
					if(val==false) {return false;};
				} else if (s.charAt(i) == '}') {
					boolean val = closingBrackets(stack, '{');
					if(val==false) {return false;};
				}
			}

		}
		if(stack.size()==0) {
			return true;
			}else {return false;}
	}

	public static boolean closingBrackets(Stack<Character> stack, char correspondingCharacter) {
		if (stack.size() == 0) {
			return false; // stack is underflow
		} else if (stack.peek() != correspondingCharacter) {
			return false; // mismatch Brackets
		} else {
			stack.pop();
			return true;
		}
	}

}
