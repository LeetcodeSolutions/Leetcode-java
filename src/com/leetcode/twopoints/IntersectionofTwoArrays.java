package com.leetcode.twopoints;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i : nums1) {
			set1.add(i);
		}
		for (int i : nums2) {
			if (set1.contains(i)) {
				set2.add(i);
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
