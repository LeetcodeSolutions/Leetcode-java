package com.leetcode.array;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        for(int i = 1; i < nums.length; i++){
      	if(nums[i] < nums[i - 1]){
      		return i - 1;
      	}
      }
      return nums.length - 1;      
  }
}