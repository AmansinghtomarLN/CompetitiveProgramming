package stack;

import java.util.Stack;

public class InfixToPreAndPostConversion {

	public static void main(String[] args) {

		String exp= "a*b+c";
		conversion(exp);
		
	}

	public static void conversion(String s) {

		Stack<String> prefix = new Stack<String>();
		Stack<String> postfix = new Stack<String>();
		Stack<Character> operator = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				operator.push(c);
			} else if ((c >= '0' && c <= '9') || 
						(c >= 'a' && c <= 'z') || 
						(c >= 'A' && c <= 'Z')) {
				prefix.push(c+"");
				postfix.push(c+"");
			}else if (c==')') {
				while(operator.peek()!='(') {
					operation(operator, prefix, postfix);
				}
				operator.pop();
			}else if (c=='+' || c=='-' || c=='/' || c=='*'){
				while(operator.size()>0 && operator.peek()!='(' && precedence(c)<=precedence(operator.peek())) {
					operation(operator, prefix, postfix);
				}
				operator.push(c);
			}
		}
		
		while(operator.size()!=0) {
			operation(operator, prefix, postfix);
		}

		System.out.println("Prefix Expression : "+ prefix.pop());
		System.out.println("Postfix Expression : "+ postfix.pop());
		
	}

	public static void operation(Stack<Character> operator, Stack<String> prefix, Stack<String> postfix) {
		
		char operte = operator.pop();
		
		// For prefix evaluation
		String v2 = prefix.pop();
		String v1 = prefix.pop();
		String preExpression = operte+v1+v2;
		prefix.push(preExpression);
		
		// For Postfix evaluation
		String v4 = postfix.pop();
		String v3 = postfix.pop();
		String postExpression = v3+v4+operte;
		postfix.push(postExpression);
	}

	public static int precedence(char c) {
		if (c == '+' || c == '-') {
			return 1;
		} else {
			return 2; // for / & *
		}
	}

}
