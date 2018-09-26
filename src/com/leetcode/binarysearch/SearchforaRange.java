package com.leetcode.binarysearch;

import java.util.Arrays;

public class SearchforaRange {

	public static void main(String[] args) {
		int[] a = {5, 7, 7, 8, 8, 10};
		SearchforaRange sr = new SearchforaRange();
		System.out.println(Arrays.toString(sr.searchRange(a, 8)));
	}
	
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int result = binarySearch(nums, target);
        if(result == -1)
        	return res;
        int lo = result;
        int hi = result;
        while((lo - 1) >= 0 && nums[lo - 1] == target){
        	lo--;
        }
        
        while((hi + 1) < nums.length && nums[hi + 1] == target){
        	hi++;
        }
        res[0] = lo;
        res[1] = hi;
        return res;
    }
    
    public int binarySearch(int[] nums, int target){
    	int lo = 0;
    	int hi = nums.length - 1;
    	
    	while(lo <= hi){
    		int mid = (lo + hi) / 2;
    		if(nums[mid] == target)
    			return mid;
    		else if(nums[mid] > target)
    			hi = mid - 1;
    		else
    			lo = mid + 1;
    	}
    	return -1;
    }

}
