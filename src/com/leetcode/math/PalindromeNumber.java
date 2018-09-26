package com.leetcode.math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int res = 0;
		int tmp = x;
		while (tmp > 0) {
			res = res * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		return x == res;       
    }
}
