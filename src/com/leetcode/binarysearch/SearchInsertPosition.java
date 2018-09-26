package com.leetcode.binarysearch;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int searchInsert(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		if (lo > hi) {
			return lo;
		} else {
			if (hi < 0)
				return 0;
			return hi;
		}
	}

}
