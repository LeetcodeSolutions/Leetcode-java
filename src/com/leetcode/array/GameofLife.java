package com.leetcode.array;

public class GameofLife {
    public void gameOfLife(int[][] board) {
        
		if (board.length == 0)
			return;
		int row = board.length;
		int col = board[0].length;
		int[][] trans = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int live = 0;
				for (int k = -1; k < 2; k++) {
					for (int m = -1; m < 2; m++) {
						if (k == 0 && m == 0)
							continue;
						if ((i + k >= 0) && (i + k < row) && (j + m >= 0) && (j + m < col)) {
							if (board[i + k][j + m] == 1)
								live++;
						}
					}
				}
				if (board[i][j] == 1) {
					if (live < 2)
						trans[i][j] = 0;
					else if (live == 2 || live == 3)
						trans[i][j] = 1;
					else if (live > 3)
						trans[i][j] = 0;
				} else {
					if (live == 3)
						trans[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				board[i][j] = trans[i][j];
			}
		}
	
    }
}
