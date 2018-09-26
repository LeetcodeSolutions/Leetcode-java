package com.leetcode.tree;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
		if (root == null)
			return true;
		if (root.val <= minVal || root.val >= maxVal)
			return false;
		return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	}

}
