package com.leetcode.array;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		backTracking(candidates, target, result, new LinkedList<Integer>(), 0, 0);
		return result;        
    }
    
    public void backTracking(int[] candidates, int target, List<List<Integer>> result, List<Integer> tmpResult,
		int tmpTotal, int level) {
		for (int i = level; i < candidates.length; i++) {
			if (tmpTotal + candidates[i] < target) {
				tmpResult.add(candidates[i]);
				backTracking(candidates, target, result, tmpResult, tmpTotal + candidates[i], i);
				tmpResult.remove(tmpResult.get(tmpResult.size() - 1));
			} else if (tmpTotal + candidates[i] == target) {
				tmpResult.add(candidates[i]);
				result.add(new LinkedList<>(tmpResult));
				tmpResult.remove(tmpResult.get(tmpResult.size() - 1));
			}
		}
	}
}
