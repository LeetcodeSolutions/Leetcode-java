package com.leetcode.twopoints;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
 		if (nums == null)
			return;
		int i = 0;
		int j = nums.length - 1;
		while (i < j) {
			while (i < j && nums[i] != 0) {
				i++;
			}

			while (i < j && nums[j] == 0) {
				j--;
			}

			if (i >= j)
				break;
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}       
    }
}
