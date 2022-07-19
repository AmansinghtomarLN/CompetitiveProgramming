package stack;

import java.util.Stack;

public class InfixExpressionEvaluation {

	public static void main(String[] args) {

//		String exp = "10+2*6";
//		String exp = "2*(5*(3+6))/5-2";
//		String exp = "5/5-2";
		String exp= "1+2*6";
		System.out.println(evaluation(exp));
	}

	public static int evaluation(String s) {
		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				operator.push(c);
			} else if (c == ')') {
				while (operator.size() > 0 && operator.peek() != '(') {
					char ch = operator.pop();
					int v2 = operand.pop();
					int v1 = operand.pop();

					int operation = operation(v1, v2, ch);
					operand.push(operation);
				}
				operator.pop(); // removing opening brackets
			} else if (Character.isDigit(c)) {
				operand.push(c - '0'); // converting character into number
			} else if (c == '+' || c == '-' || c == '*' || c == '/') {
				while (operator.size() > 0 && operator.peek() != '(' && precedence(c) <= precedence(operator.peek())) {
					char ch = operator.pop();
					int v2 = operand.pop();
					int v1 = operand.pop();

					int operation = operation(v1, v2, ch);
					operand.push(operation);
				}
				operator.push(c);
			}
		}
		while (operator.size() != 0) {
			char ch = operator.pop();
			int v2 = operand.pop();
			int v1 = operand.pop();

			int operation = operation(v1, v2, ch);
			operand.push(operation);
		}

		return operand.peek();
	}

	public static int operation(int v1, int v2, char ch) {
		if (ch == '+') {
			return v1 + v2;
		} else if (ch == '-') {
			return v1 - v2;
		} else if (ch == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}
	}

	public static int precedence(char ch) {
		if (ch == '+') {
			return 1;
		} else if (ch == '-') {
			return 1;
		} else if (ch == '*') {
			return 2;
		} else {
			return 2;
		}
	}

}
