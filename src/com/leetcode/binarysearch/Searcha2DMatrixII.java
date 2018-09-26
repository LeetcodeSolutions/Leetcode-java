package com.leetcode.binarysearch;

public class Searcha2DMatrixII {

	public static void main(String[] args) {
		int[][] a = {
		             {1,   4,  7, 11, 15},
		             {2,   5,  8, 12, 19},
		             {3,   6,  9, 16, 22},
		             {10, 13, 14, 17, 24},
		             {18, 21, 23, 26, 30},
		};
		Searcha2DMatrixII sd = new Searcha2DMatrixII();
		System.out.println(sd.searchMatrix(a,24));
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;
		for(int i = 0; i < matrix.length; i++){
			if(matrix[i][matrix[i].length - 1] >= target && matrix[i][0] <= target){
				if(binarySearch(matrix, i, target))
					return true;
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
