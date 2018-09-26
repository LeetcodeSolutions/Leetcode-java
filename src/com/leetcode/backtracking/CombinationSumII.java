package com.leetcode.backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		   List<List<Integer>> result = new LinkedList<List<Integer>>();
		   List<Integer> tmpResult = new LinkedList<Integer>();
		   Arrays.sort(candidates);
		   dfs(candidates,target,0,tmpResult,result);
		   return result;       
 }
 
	   public void dfs(int[] candidates,int target, int level, List<Integer> tmpRes,List<List<Integer>> result){
		   if(target < 0)
			   return;
		   if(target == 0){
			   result.add(new LinkedList<>(tmpRes));
			   return;
		   }
		   for(int i = level; i < candidates.length; i++){
			   if(i > level && candidates[i] == candidates[i - 1])
				   continue;
			   tmpRes.add(candidates[i]);
			   dfs(candidates,target - candidates[i],i + 1,tmpRes,result);
			   tmpRes.remove(tmpRes.size() - 1);
		   }
	   }
}
