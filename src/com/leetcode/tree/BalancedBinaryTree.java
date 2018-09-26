package com.leetcode.tree;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int left = getDeepth(root.left);
		int right = getDeepth(root.right);
		return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
	}

	public int getDeepth(TreeNode node) {
		if (node == null)
			return 0;
		return Math.max(getDeepth(node.left), getDeepth(node.right)) + 1;
	}
}
