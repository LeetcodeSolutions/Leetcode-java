package com.leetcode.array;

public class MajorityElement {
    public int majorityElement(int[] nums) {
		if (nums.length == 1 || nums.length == 2)
			return nums[0];
		int k = 1;
		int num = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (num == nums[i]) {
				k++;
			} else {
				if (k == 1) {
					num = nums[i];
					k = 1;
				} else {
					k--;
				}
			}
		}
		return num;
    }
}
