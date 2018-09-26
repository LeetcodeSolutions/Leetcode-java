package com.leetcode.array;

import java.util.Stack;

public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        if(heights == null || heights.length <= 0)
        	return result;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = 0; i <= heights.length; i++){
        	int curt = i== heights.length ? -1 : heights[i]; 
        	while(!stack.isEmpty() && curt <= heights[stack.peek()]){
        		int h = heights[stack.pop()];
        		int w = stack.isEmpty() ? i : i - stack.peek() - 1;
        		result = Math.max(result, h * w);
        	}
        	stack.push(i);
        }
        return result; 
    }
}
