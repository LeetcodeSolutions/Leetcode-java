package com.leetcode.dp;

import java.util.Arrays;

public class HouseRobber {
    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0)
        	return 0;
        if(nums.length == 1)
        	return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[0] > nums[1] ? nums[0] : nums[1];
        for(int i = 2; i < nums.length; i++){
        	dp[i] = dp[i - 1] > dp[i - 2] + nums[i] ? dp[i - 1] : dp[i - 2] + nums[i];
        }
        return dp[dp.length - 1];
    }
    public static void main(String[] args) {
    	int[] a = {2,1,1,2};
		System.out.println(rob(a));
	}
}
