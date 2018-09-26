package com.leetcode.sting;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() <= 0)
        	return 0;
        String[] ss = s.trim().split(" ");
        if(ss.length > 0)
        	return ss[ss.length - 1].length();
        return 0;
    }

}
