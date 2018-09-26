package com.leetcode.twopoints;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length <= 2)
        	return 0;
        
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
        	if(i != 0 && nums[i] == nums[i - 1])
        		continue;
        	int left = i + 1;
        	int right = nums.length - 1;
        	
        	while(left < right){
        		int sum = nums[i] + nums[left] + nums[right];
        		if(sum == target)
        			return target;
        		if(Math.abs(target - closest) > Math.abs(target - sum))
        			closest = sum;
        		if(sum > target)
        			right--;
        		else{
        			left++;
        		}
        	}
        }
        return closest;    
    }
}
