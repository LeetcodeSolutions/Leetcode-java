package com.leetcode.binarysearch;

import com.leetcode.tree.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
    	if(root == null)
    		return 0;
        int leftDepth = getLeftDepth(root);
        int rightDepth = getRightDepth(root);
        if(leftDepth == rightDepth)
        	return (1<<leftDepth) - 1;
        else
        	return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public int getLeftDepth(TreeNode root){
    	int dep = 0;
    	while(root != null){
    		dep++;
    		root = root.left;
    	}
    	return dep;
    }
    
    public int getRightDepth(TreeNode root){
    	int dep = 0;
    	while(root != null){
    		dep++;
    		root = root.right;
    	}
    	return dep;
    }
}
