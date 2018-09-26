package com.leetcode.dp;

import java.util.Stack;

public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null)
			return 0;
		if(matrix.length <= 0)
			return 0;
        int row = matrix.length;
		int column = matrix[0].length;

		int[][] mdp = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] == '0') {
					mdp[i][j] = 0;
				} else {
					mdp[i][j] = i == 0 ? 1 : 1 + mdp[i - 1][j];
				}
			}
		}
		int max = 0;
		for(int i = 0; i < row; i++){
			Stack<Integer> stack = new Stack<Integer>();
			for(int j  = 0; j <= column; j++){
				int curt = j == column ? -1 : mdp[i][j];
				
				while(!stack.isEmpty() && curt <= mdp[i][stack.peek()]){
				    int h = mdp[i][stack.pop()];
					int w = stack.isEmpty() ? j : j - stack.peek() - 1;
					max = Math.max(max, h * w);
				}
				stack.push(j);
			}
		}
		return max;
    }
}
