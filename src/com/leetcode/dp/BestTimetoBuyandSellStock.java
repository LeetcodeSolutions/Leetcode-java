package com.leetcode.dp;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
		if(prices == null || prices.length <= 1){
			return 0;
		}
		int maxValue = 0;
		int[] dp = new int[prices.length];
		dp[0] = prices[0];
		for (int i = 1; i < dp.length; i++) {
			if(prices[i] < dp[i - 1]){
				dp[i] = prices[i];
			}else{
				dp[i] = dp[i - 1];
			}
			if(prices[i] - dp[i] > maxValue){
				maxValue = prices[i] - dp[i];
			}
		}
		return maxValue;    
    }
}
