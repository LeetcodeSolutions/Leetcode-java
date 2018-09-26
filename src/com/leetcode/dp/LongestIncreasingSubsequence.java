package com.leetcode.dp;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	int max = 1;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
        	dp[i] = 1;
        	for(int j = 0; j < i; j++){
        		if(nums[i] > nums[j]){
        			if(dp[i] < dp[j] + 1){
        				dp[i] = dp[j] + 1;
        			}
        		}
        	}
        	if(dp[i] > max)
        		max = dp[i];
        }
        return max;
    }
}
