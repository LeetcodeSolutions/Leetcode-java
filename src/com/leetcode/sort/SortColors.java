package com.leetcode.sort;

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length <= 1)
			return;
		int[] arr = new int[4];
		for (int i : nums) {
			arr[i + 1]++;
		}

		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}
		int[] aux = new int[nums.length];
		for (int j = 0; j < nums.length; j++) {
			aux[arr[nums[j]]++] = nums[j];
		}
		
		System.arraycopy(aux, 0, nums, 0, aux.length);
    }
}
