package com.leetcode.dp;

public class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length == 0)
        	return 0;
        if(nums.length < 2)
        	return nums[0];
        int[] dp0 = new int[nums.length + 1];
        int[] dp1 = new int[nums.length + 1];
        dp0[0] = 0;
        dp1[0] = 0;
        dp0[1] = nums[0];
        dp1[1] = 0;
        
        for(int i = 2; i <= nums.length; i++){
        	dp0[i] = Math.max(dp0[i - 1], dp0[i - 2] + nums[i - 1]);
        	dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + nums[i - 1]);
        }
        return Math.max(dp0[nums.length - 1], dp1[nums.length]);
    }
}
