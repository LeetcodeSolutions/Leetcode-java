package com.leetcode.binarysearch;

public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;
		int loRow = 0;
		int hiRow = matrix.length - 1;
		int hiColumn = matrix[0].length - 1;
		if (target < matrix[0][0] || target > matrix[hiRow][matrix[0].length - 1])
			return false;

		while (loRow <= hiRow) {
			int midRow = (loRow + hiRow) / 2;
			if (target < matrix[midRow][0]) {
				hiRow = midRow - 1;
			} else if (target > matrix[midRow][hiColumn]) {
				loRow = midRow + 1;
			} else {
				return binarySearch(matrix, midRow, target);
			}
		}
		return false;
	}

	public boolean binarySearch(int[][] matrix, int row, int target) {
		int lo = 0;
		int hi = matrix[row].length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (matrix[row][mid] == target) {
				return true;
			} else if (matrix[row][mid] > target) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return false;
	}
}
