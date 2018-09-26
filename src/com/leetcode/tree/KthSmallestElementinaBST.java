package com.leetcode.tree;

public class KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        int size = treeSize(root.left);
        if(k <= size){
        	return kthSmallest(root.left, k);
        }else if(k > size + 1){
        	return kthSmallest(root.right, k - size - 1);
        }else{
        	return root.val;
        }
    }
    
    public int treeSize(TreeNode root){
    	if(root == null)
    		return 0;
    	return 1 + treeSize(root.left) + treeSize(root.right);
    }
}
