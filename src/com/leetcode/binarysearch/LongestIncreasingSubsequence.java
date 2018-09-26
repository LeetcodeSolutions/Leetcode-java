package com.leetcode.binarysearch;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] a = {1,3,6,7,9,4,10,5,6};
		System.out.println(lengthOfLIS2(a));
	}
	
    public static int lengthOfLIS(int[] nums) {
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
    
    public static int lengthOfLIS2(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            System.out.println(i);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
            System.out.println(Arrays.toString(dp));
        }

        return len;
    }

}
