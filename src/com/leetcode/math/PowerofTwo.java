package com.leetcode.math;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public boolean isPowerOfTwo(int n) {
        int maxPowerOfTwo = (int)Math.pow(2, (int)(Math.log(Integer.MAX_VALUE)/Math.log(2)));
        return n > 0 && (maxPowerOfTwo % n == 0);
    }

}
