package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
      if(root == null)
      	return result;
      List<Integer> tmp = new ArrayList<Integer>();
      dfs(result,tmp, root, 0, sum);
      return result;      
  }
  
      public void dfs(List<List<Integer>> result, List<Integer> tmp, TreeNode root,int sum, int target){
		if (root.left == null && root.right == null) {
			if (sum + root.val == target) {
				List<Integer> tmpRes = new ArrayList<Integer>(tmp);
				tmpRes.add(root.val);
				result.add(tmpRes);
			}
			return;
		}
  	
  	if(root.left != null){
  		tmp.add(root.val);
  		dfs(result, tmp, root.left, sum + root.val, target);
  		tmp.remove(tmp.size() - 1);
  	}
  	
  	if(root.right != null){
  		tmp.add(root.val);
  		dfs(result, tmp, root.right, sum + root.val, target);
  		tmp.remove(tmp.size() - 1);
  	}
  }
}
