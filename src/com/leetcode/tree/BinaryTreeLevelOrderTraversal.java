package com.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if(root == null)
    		return result;
    	int currentLevel = 1;
    	int lastLevel = 0;
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.offer(root);
    	while(currentLevel > 0){
    		List<Integer> tmpResult = new ArrayList<Integer>();
    		while(currentLevel > 0){
    			TreeNode x = q.poll();
    			tmpResult.add(x.val);
    			currentLevel--;
    			if(x.left != null){
    				q.offer(x.left);
    				lastLevel++;
    			}
    			
    			if(x.right != null){
    				q.offer(x.right);
    				lastLevel++;
    			}
    			
    		}
    		currentLevel = lastLevel;
    		lastLevel = 0;
    		result.add(tmpResult);
    	}
        return result;        
    }
}
