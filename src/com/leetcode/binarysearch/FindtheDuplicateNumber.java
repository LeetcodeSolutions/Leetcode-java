package com.leetcode.binarysearch;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		int[] a = {3,4,4,6,5,1,2};
		System.out.println(findDuplicate(a));
	}
	
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(slow != fast){
        	slow = nums[slow];
        	fast = nums[nums[fast]];
        }
        fast = 0;
        
        while(slow != fast){
        	slow = nums[slow];
        	fast = nums[fast];
        }
        return slow;
    }

}
