package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
        inorderTraversal(root, result);
        return result;
    }
    
    public void inorderTraversal(TreeNode root, List<Integer> list){
    	if(root == null)
    		return;
    	inorderTraversal(root.left, list);
    	list.add(root.val);
    	inorderTraversal(root.right, list);
    }
}
