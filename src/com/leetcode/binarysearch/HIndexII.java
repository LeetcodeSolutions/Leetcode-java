package com.leetcode.binarysearch;

public class HIndexII {
	public static int hIndex(int[] citations) {
		int n = citations.length;
		int start = 0;
		int end = n - 1;
		int middle;
		while (start <= end) {
			middle = (end - start) / 2 + start;
			if (citations[middle] == n - middle)
				return citations[middle];
			else if (citations[middle] < n - middle)
				start = middle + 1;
			else
				end = middle - 1;
		}
		return n - end - 1;
	}
	public static void main(String[] args) {
		int[] citations = {1,2,2,4,5};
		System.out.println(hIndex(citations));
	}
}
