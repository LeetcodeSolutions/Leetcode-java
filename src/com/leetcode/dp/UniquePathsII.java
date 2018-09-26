package com.leetcode.dp;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		int col = obstacleGrid[0].length;
		
		int[][] dp = new int[row][col];
		if(obstacleGrid[0][0] != 1)
			dp[0][0] = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i == 0 && j == 0)
					continue;
				if (obstacleGrid[i][j] != 1) {
					dp[i][j] = (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0);
				}
			}
		}
		return dp[row - 1][col - 1];       
    }
}
