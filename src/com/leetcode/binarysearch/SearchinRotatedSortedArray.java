package com.leetcode.binarysearch;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length <= 0)
			return -1;
		int start = 0;
		int end = nums.length - 1;
		if (nums[start] <= nums[end])
			return binarySearch(nums, start, end, target);
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		int rot = start;
		start = 0;
		end = nums.length - 1;

		if (nums[start] <= target && nums[rot - 1] >= target) {
			return binarySearch(nums, start, rot - 1, target);
		} else {
			return binarySearch(nums, rot, end, target);
		}
	}

	public int binarySearch(int[] arr, int start, int end, int target) {
		while (start <= end) {
			int mid = (end + start) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;
	}
}
