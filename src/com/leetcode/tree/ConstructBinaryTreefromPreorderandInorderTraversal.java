package com.leetcode.tree;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length != inorder.length )
			return null;
		return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
	}

	public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
    	if(inStart > inEnd || preStart > preEnd)
    		return null;
		TreeNode root = new TreeNode(preorder[preStart]);
		int position = -1;
		for (int i = inStart; i <= inEnd; i++) {
			if (inorder[i] == preorder[preStart]) {
				position = i;
				break;
			}
		}
		
		root.left = buildTree(preorder, preStart + 1, position  + preStart - inStart, inorder, inStart, position - 1);
		root.right = buildTree(preorder, preEnd  + position + 1 - inEnd, preEnd, inorder, position + 1, inEnd);
		return root;
	}
}
