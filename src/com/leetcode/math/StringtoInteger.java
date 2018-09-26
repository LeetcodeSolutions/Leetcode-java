package com.leetcode.math;

public class StringtoInteger {
    public int myAtoi(String str) {
		str = str.trim();
		if (str == null || str.length() <= 0)
			return 0;
		long res = 0;
		boolean isNeg = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				res = res * 10 + (str.charAt(i) - '0');
				if (isNeg && (-1) * res < Integer.MIN_VALUE) {
					return Integer.MIN_VALUE;
				}
				if (!isNeg && res > Integer.MAX_VALUE) {
					return Integer.MAX_VALUE;
				}
			} else if (str.charAt(i) == '+' && i == 0) {
				isNeg = false;
			} else if (str.charAt(i) == '-' && i == 0) {
				isNeg = true;
			} else {
				break;
			}
		}
		res = isNeg ? res * (-1) : res;
		return (int) res;
    }
}
