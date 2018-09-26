package com.leetcode.twopoints;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
    	if(nums == null)
    		return 0;
        int index = 0;
        int length = nums.length;
        while(index < length){
        	if(nums[index]  == val){
        		int replaceIndex = index;
        		while(replaceIndex < length - 1){
        			nums[replaceIndex] = nums[replaceIndex + 1];
        			replaceIndex++;
        		}
        		length--;
        	}else{
        		index++;
        	}
        	
        }
        return length;        
    }
}
