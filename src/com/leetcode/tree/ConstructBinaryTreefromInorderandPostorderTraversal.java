package com.leetcode.tree;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length != postorder.length)
			return null;
		return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
	}

	public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
		if (inStart > inEnd || postStart > postEnd)
			return null;
		TreeNode root = new TreeNode(postorder[postEnd]);

		int position = -1;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == postorder[postEnd]) {
				position = i;
				break;
			}
		}
		
		root.left = buildTree(inorder, inStart, position - 1, postorder, postStart, postStart + position - 1 - inStart);
	    root.right = buildTree(inorder, position + 1, inEnd, postorder, postEnd + position - inEnd, postEnd - 1);
		return root;
	}
}
