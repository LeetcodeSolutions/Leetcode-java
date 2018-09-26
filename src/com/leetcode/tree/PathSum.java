package com.leetcode.tree;

public class PathSum {
	private boolean mHasTarget = false;

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		dfs(root, 0, sum);
		return mHasTarget;
	}

	public void dfs(TreeNode node, int sum, int target) {
		if (node.left == null && node.right == null) {
			if (sum + node.val == target) {
				mHasTarget = true;
			}
		}
		if (node.left != null)
			dfs(node.left, sum + node.val, target);
		if (node.right != null)
			dfs(node.right, sum + node.val, target);
	}
}
