package com.leetcode.math;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(99));
	}
	
	
    public static int trailingZeroes(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        return sum;
    }

}
