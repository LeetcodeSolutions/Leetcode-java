package com.leetcode.stack;

import java.util.Stack;

public class MinStack {
	private Stack<Integer> normalStack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {
		normalStack.push(x);
		if (minStack.isEmpty()) {
			minStack.push(x);
		} else {
			minStack.push(Math.min(minStack.peek(), x));
		}
	}

	public void pop() {
		normalStack.pop();
		minStack.pop();
	}

	public int top() {
		return normalStack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
