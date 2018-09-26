package com.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {
	private Queue<Integer> q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();
    public void push(int x) {
       if(q1.isEmpty()){
    	   q1.offer(x);
       }else{
    	   copyQ1ToQ2();
    	   q1.clear();
    	   q1.offer(x);
    	   copyQ2ToQ1();
       }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q1.poll();
    }
    
    private void copyQ1ToQ2(){
    	while(!q1.isEmpty()){
    		q2.offer(q1.poll());
    	}
    }
    
    private void copyQ2ToQ1(){
    	while(!q2.isEmpty()){
    		q1.offer(q2.poll());
    	}
    }

    // Get the top element.
    public int top() {
       return  q1.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q1.isEmpty();
    }
}
