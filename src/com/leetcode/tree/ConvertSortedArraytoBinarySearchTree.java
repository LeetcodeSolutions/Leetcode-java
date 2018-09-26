package com.leetcode.tree;

public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null)
        	return null;
        return dfs(nums,0,nums.length - 1);
    }
    
    public TreeNode dfs(int[] nums, int start, int end){
    	if(start > end)
    		return null;
    	int mid = (start + end) / 2;
    	TreeNode root = new TreeNode(nums[mid]);
    	root.left = dfs(nums,start,mid - 1);
    	root.right = dfs(nums,mid + 1,end);
    	return root;
    }

}
