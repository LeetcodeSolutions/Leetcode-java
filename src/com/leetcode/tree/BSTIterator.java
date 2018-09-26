package com.leetcode.tree;

import java.util.Stack;

public class BSTIterator {
	private Stack<Integer> mStack = new Stack<Integer>();
    public BSTIterator(TreeNode root) {
    	postInorder(root);
    }
    
    private void postInorder(TreeNode root){
    	if(root == null)
    		return;
    	postInorder(root.right);
    	mStack.push(root.val);
    	postInorder(root.left);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !mStack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        return mStack.pop();
    }
}
