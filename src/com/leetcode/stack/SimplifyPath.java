package com.leetcode.stack;

import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path == null || path.length() <= 0)
        	return path;
        
        String[] paths = path.split("/");
        //System.out.println(Arrays.toString(paths));
        Stack<String> stack = new Stack<String>();
        Stack<String> stack1 = new Stack<String>();
        for(String string : paths){
        	if(string.equals(".") || string.equals("")){
        		
        	} else if(string.equals("..")){
        	    if (!stack.isEmpty())
        		stack.pop();
        	}else{
        		stack.push(string);
        	}
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
        	stack1.push(stack.pop());
        }
        
        while(!stack1.isEmpty()){
        	sb.append("/");
        	sb.append(stack1.pop());
        }
        
        if(sb.length() <= 0){
        	sb.append("/");
        }
        return sb.toString();
    }
}
