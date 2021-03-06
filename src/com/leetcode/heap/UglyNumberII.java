package com.leetcode.heap;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
		int[] dp = new int[n];
		dp[0] = 1;

		int t2 = 0, t3 = 0, t5 = 0;
		for (int i = 1; i < n; i++) {
			int min = Math.min(dp[t2] * 2, Math.min(dp[t3] * 3, dp[t5] * 5));

			if (min == dp[t2] * 2) {
				dp[i] = dp[t2] * 2;
				t2++;
			}

			if (min == dp[t3] * 3) {
				dp[i] = dp[t3] * 3;
				t3++;
			}

			if (min == dp[t5] * 5) {
				dp[i] = dp[t5] * 5;
				t5++;
			}
		}
		return dp[n - 1];
    }
}
