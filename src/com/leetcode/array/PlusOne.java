package com.leetcode.array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
		int carry = 0;
		digits[digits.length - 1] += 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i] += carry;
			carry = digits[i] / 10;
			digits[i] = digits[i] % 10;
		}
		if (carry > 0) {
			int[] newArr = new int[digits.length + 1];
			newArr[0] = carry;
			System.arraycopy(digits, 0, newArr, 1, digits.length);
			return newArr;
		} else {
			return digits;
		}        
    }
}
