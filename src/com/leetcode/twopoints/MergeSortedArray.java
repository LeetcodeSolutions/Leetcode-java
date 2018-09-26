package com.leetcode.twopoints;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 		int i = 0;
		int j = 0;
		int[] aux = new int[m];
		System.arraycopy(nums1, 0, aux, 0, m);
		for (int k = 0; k < m + n; k++) {
			if (i == m) {
				nums1[k] = nums2[j++];
			} else if (j == n) {
				nums1[k] = aux[i++];
			} else if (aux[i] > nums2[j]) {
				nums1[k] = nums2[j++];
			} else {
				nums1[k] = aux[i++];
			}
		}       
    }
}
