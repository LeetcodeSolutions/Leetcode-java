package com.leetcode.stack;

import java.util.Stack;

public class ImplementQueueusingStacks {
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
     	if(stack2.isEmpty())
    		moveStack1ToStack2();
        stack2.pop();
    }
    
    private void moveStack1ToStack2(){
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    }

    // Get the front element.
    public int peek() {
    	if(stack2.isEmpty())
    		moveStack1ToStack2();
    	return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	//moveStack1ToStack2();
    	return stack2.isEmpty() && stack1.isEmpty();
    }
}
