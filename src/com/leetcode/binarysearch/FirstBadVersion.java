package com.leetcode.binarysearch;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int firstBadVersion(int n) {
		int start = 1, end = n;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;
	}

	boolean isBadVersion(int version) {
		return false;
	}

}
