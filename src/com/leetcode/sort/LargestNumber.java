package com.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String largestNumber(int[] nums) {
        if(nums == null)
        	return null;
        String[] snum = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
        	snum[i] = nums[i] + "";
        }
        Arrays.sort(snum, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String s1 = o1 + o2;
				String s2 = o2 + o1;
				return s1.compareTo(s2);
			}
		});
        if(snum[snum.length - 1].charAt(0) == '0')
        	return "0";
        StringBuilder sb = new StringBuilder();
        for(String string : snum){
        	sb.insert(0, string);
        }
        return sb.toString();        
    }

}
