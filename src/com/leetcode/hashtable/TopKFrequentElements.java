package com.leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	public  static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int num : nums){
			map.put(num, map.getOrDefault(num, 0)+ 1);
		}
		
		List<Integer>[] backPocket = new List[nums.length + 1];
		
		for(int key : map.keySet()){
			int freq = map.get(key);
			if(backPocket[freq] == null)
				backPocket[freq] = new ArrayList<Integer>();
			backPocket[freq].add(key);
		}
		List<Integer> result = new ArrayList<Integer>();
		for(int i = backPocket.length - 1; i >= 0 && result.size() < k;i--){
			if(backPocket[i] != null){
				result.addAll(backPocket[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] a = {-1,-1};
		List<Integer> res = topKFrequent(a, 1);
	}
}
