package com.leetcode.stack;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		postorderTraversal(root, result);
		return result;
	}

	public void postorderTraversal(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		postorderTraversal(root.left, list);
		postorderTraversal(root.right, list);
		list.add(root.val);
	}
}
