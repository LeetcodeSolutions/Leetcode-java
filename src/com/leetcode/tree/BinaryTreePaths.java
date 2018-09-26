package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new LinkedList<String>();
		if (root == null)
			return result;
		dfs(root, result, root.val + "");
		return result;
	}

	public void dfs(TreeNode root, List<String> result, String tmpRes) {
		if (root.left == null && root.right == null) {
			result.add(tmpRes);
			return;
		}
		if (root.left != null) {
			dfs(root.left, result, tmpRes + "->" + root.left.val);
		}
		if (root.right != null) {
			dfs(root.right, result, tmpRes + "->" + root.right.val);
		}
	}
}
