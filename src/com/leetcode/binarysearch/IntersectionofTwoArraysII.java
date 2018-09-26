package com.leetcode.binarysearch;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer,Integer> set1 = new HashMap<Integer,Integer>();
		List<Integer> set2 = new LinkedList<Integer>();
		for (int i : nums1) {
			if(set1.containsKey(i)){
				set1.put(i, set1.get(i) + 1);
			}else{
				set1.put(i, 1);
			}
		}
		
		for (int i : nums2) {
			if (set1.containsKey(i) && set1.get(i) > 0) {
				set2.add(i);
				set1.put(i, set1.get(i) - 1);
			}
		}
		int[] res = new int[set2.size()];
		int i = 0;
		for (int j : set2) {
			res[i++] = j;
		}
		return res;        
    }
}
