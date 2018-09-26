package com.leetcode.stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
		if (s == null || s.length() <= 0)
			return true;
		byte[] bs = s.getBytes();
		Stack<Byte> stack = new Stack<Byte>();
		for (int i = 0; i < bs.length; i++) {
			switch (bs[i]) {
			case '(':
			case '[':
			case '{':
				stack.push(bs[i]);
				break;
			case ')':
				if (stack.isEmpty())
					return false;
				if (stack.peek() != '(')
					return false;
				stack.pop();
				break;
			case ']':
				if (stack.isEmpty())
					return false;
				if (stack.peek() != '[')
					return false;
				stack.pop();
				break;
			case '}':
				if (stack.isEmpty())
					return false;
				if (stack.peek() != '{')
					return false;
				stack.pop();
				break;
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
    }

}
