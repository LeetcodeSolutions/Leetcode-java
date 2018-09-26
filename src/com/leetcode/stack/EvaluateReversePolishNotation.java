package com.leetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String string : tokens){
        	if(string.equals("+")){
        		Integer o1 = stack.pop();
        		Integer o2 = stack.pop();
        		stack.push(o1 + o2);
        	}else if(string.equals("-")){
        		Integer o1 = stack.pop();
        		Integer o2 = stack.pop();
        		stack.push(o2 - o1);
        	}else if(string.equals("*")){
        		Integer o1 = stack.pop();
        		Integer o2 = stack.pop();
        		stack.push(o2 * o1);
        	}else if(string.equals("/")){
        		Integer o1 = stack.pop();
        		Integer o2 = stack.pop();
        		stack.push(o2 / o1);
        	}else{
        		stack.push(Integer.parseInt(string));
        	}
        }
        return stack.pop(); 
    }
}
