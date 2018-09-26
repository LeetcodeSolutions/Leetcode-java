package com.leetcode.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
   interface NestedInteger {
 
      // @return true if this NestedInteger holds a single integer, rather than a nested list.
      public boolean isInteger();
 
      // @return the single integer that this NestedInteger holds, if it holds a single integer
      // Return null if this NestedInteger holds a nested list
      public Integer getInteger();
 
      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }
 


public class NestedIterator implements Iterator<Integer> {
	private Queue<Integer> q = new LinkedList<Integer>();
    public NestedIterator(List<NestedInteger> nestedList) {
    	dfs(nestedList);
    }
    
    private void dfs(List<NestedInteger> nestedList){
    	for(NestedInteger nest : nestedList){
    		if(nest.isInteger()){
    			q.offer(nest.getInteger());
    		}else{
    			dfs(nest.getList());
    		}
    	}
    }

    @Override
    public Integer next() {
        return  q.poll();
    }

    @Override
    public boolean hasNext() {
         return q.size() > 0;
    }
}
