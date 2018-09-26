package com.leetcode.array;

public class RemoveDuplicatesfromSortedArray {
	   public int removeDuplicates(int[] nums) {
	    	if(nums == null || nums.length == 0)
	    		return 0;
	        int length = nums.length;
	    	for(int i = 1; i < length;i++){
	    		if(nums[i] == nums[i - 1]){
	    			int j  = i;
	    			while(j < length - 1){
	    				nums[j] = nums[j + 1];
	    				j++;
	    			}
	    			length--;
	    			i--;
	    		}
	    	}
	    	return length;      
	    }
}
