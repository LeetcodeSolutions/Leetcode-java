package com.leetcode.stack;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<Integer>();
    	preorderTraversal(root, res);
    	return res;    
    }
    private void preorderTraversal(TreeNode root,List<Integer> list){
    	if(root == null)
    		return;
    	list.add(root.val);
    	preorderTraversal(root.left, list);
    	preorderTraversal(root.right, list);
    }
}
