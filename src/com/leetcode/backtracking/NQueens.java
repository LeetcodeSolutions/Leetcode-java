package com.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		NQueens nqs = new NQueens();
		List<List<String>> res = nqs.solveNQueens(4);
		for(List<String> tmpRes : res){
			System.out.println(tmpRes.toString());
		}

	}

	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		char[][] nQueens = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				nQueens[i][j] = '.';
			}
		}
		solveNQueens(res, nQueens, 0, n);
		return res;
	}

	public void solveNQueens(List<List<String>> result, char[][] nQueens, int row, int n) {
		if (row == n) {
			List<String> tmpRes = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				tmpRes.add(new String(nQueens[i]));
			}
			result.add(tmpRes);
			return;
		}
		for(int col = 0;  col < n; col++){
			System.out.println("row == " + row + ", col == " + col);
			if(isValid(nQueens, row, col, n)){
				nQueens[row][col] = 'Q';
				for(int i = 0; i < n; i++){
					System.out.println(Arrays.toString(nQueens[i]));
				}
				solveNQueens(result, nQueens, row + 1, n);
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
