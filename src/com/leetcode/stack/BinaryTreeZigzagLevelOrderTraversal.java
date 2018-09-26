package com.leetcode.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		int currentLevel = 1;
		int lastLevel = 0;
		int depth = 1;
		while (currentLevel > 0) {

			LinkedList<TreeNode> tmpQ = new LinkedList<TreeNode>();
			while (currentLevel > 0) {
				TreeNode x = q.poll();
				currentLevel--;
				tmpQ.add(x);
				if (x.left != null) {
					q.offer(x.left);
					lastLevel++;
				}
				if (x.right != null) {
					q.offer(x.right);
					lastLevel++;
				}
			}
			List<Integer> tmp = new LinkedList<Integer>();
			while (!tmpQ.isEmpty()) {
				if (depth % 2 == 1) {
					tmp.add(tmpQ.removeFirst().val);
				} else {
					tmp.add(tmpQ.removeLast().val);
				}
			}
			result.add(tmp);
			currentLevel = lastLevel;
			lastLevel = 0;
			depth++;
		}
		return result;
    }
}
