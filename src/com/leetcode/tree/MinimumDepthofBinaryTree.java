package com.leetcode.tree;

public class MinimumDepthofBinaryTree {
	private int minDepth = Integer.MAX_VALUE;

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		dfs(root, 1);
		return minDepth;
	}

	public void dfs(TreeNode root, int depth) {
		if (root.left == null && root.right == null) {
			if (minDepth > depth)
				minDepth = depth;
		}
		depth++;
		if (root.left != null) {
			dfs(root.left, depth);
		}

		if (root.right != null) {
			dfs(root.right, depth);
		}
	}
}
