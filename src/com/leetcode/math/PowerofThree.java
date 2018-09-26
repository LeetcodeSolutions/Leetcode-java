package com.leetcode.math;

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        int maxPowerofThree = (int)Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
        return n > 0 && (maxPowerofThree % n == 0); 
    }
}
