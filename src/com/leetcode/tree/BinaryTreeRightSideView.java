package com.leetcode.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<Integer>();
       if(root == null)
       	return result;
       Queue<TreeNode> q = new LinkedList<TreeNode>();
       q.offer(root);
       int currentLevel = 1;
       int lastLevel = 0;
       while(currentLevel > 0){
       	while(currentLevel > 0){
       		TreeNode node = q.poll();
       		if(node.left != null){
       			q.offer(node.left);
       			lastLevel++;
       		}
       		
       		if(node.right != null){
       			q.offer(node.right);
       			lastLevel++;
       		}
       		currentLevel--;
       		if(currentLevel == 0){
       			result.add(node.val);
       		}
       		
       	}
       	currentLevel = lastLevel;
       	lastLevel = 0;
       	
       }
       return result;       
   }
}
