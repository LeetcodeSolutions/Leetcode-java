package com.leetcode.heap;

import java.util.Arrays;

public class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
    }
}
