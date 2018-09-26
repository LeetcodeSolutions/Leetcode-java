package com.leetcode.tree;

public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
 		if (root == null)
			return;
		if (root.left != null) {
			TreeNode tmpRight = root.right;
			TreeNode mid = root.left;
			root.right = root.left;
			root.left = null;

			while (mid.right != null) {
				mid = mid.right;
			}

			mid.right = tmpRight;

		}
		flatten(root.right);       
    }
}
