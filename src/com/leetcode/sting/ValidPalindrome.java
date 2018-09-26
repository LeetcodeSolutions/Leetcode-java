package com.leetcode.sting;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
		if (s == null || s.length() <= 0)
			return true;

		String ss = s.toLowerCase();

		int left = 0;
		int right = ss.length() - 1;

		while (left < right) {
			while ((left < right) 
					&& (!Character.isAlphabetic(ss.charAt(left)) && !Character.isDigit(ss.charAt(left))))
				left++;
			while ((left < right)
					&& (!Character.isAlphabetic(ss.charAt(right)) && !Character.isDigit(ss.charAt(right))))
				right--;
			if (left >= right)
				break;
			if (ss.charAt(left) != ss.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;     
    }
}
