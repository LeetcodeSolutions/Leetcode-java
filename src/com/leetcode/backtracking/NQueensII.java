package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueensII nqs = new NQueensII();
		System.out.println(nqs.totalNQueens(4));
	}
	
	private int mCount = 0;
	
	public int totalNQueens(int n) {
		char[][] nQueens = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nQueens[i][j] = '.';
			}
		}
		solveNQueens(nQueens, 0, n);
		return mCount;
	}

	public void solveNQueens(char[][] nQueens, int row, int n) {
		if (row == n) {
			mCount++;
			return;
		}
		for(int col = 0;  col < n; col++){
			if(isValid(nQueens, row, col, n)){
				nQueens[row][col] = 'Q';
				solveNQueens( nQueens, row + 1, n);
				nQueens[row][col] = '.';
			}
		}

	}

	public boolean isValid(char[][] nQueens, int row, int col, int n) {
		for (int i = 0; i != row; i++) {
			if (nQueens[i][col] == 'Q')
				return false;
		}

		for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (nQueens[i][j] == 'Q')
				return false;
		}

		for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
			if (nQueens[i][j] == 'Q')
				return false;
		}
		return true;
	}

}
