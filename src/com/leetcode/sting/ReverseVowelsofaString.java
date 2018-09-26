package com.leetcode.sting;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsofaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "OE";
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		if (s == null || s.length() <= 1) {
			return s;
		}
		Set<Character> bset = new HashSet<Character>();
		bset.add('a');
		bset.add('e');
		bset.add('i');
		bset.add('o');
		bset.add('u');
		bset.add('A');
		bset.add('E');
		bset.add('I');
		bset.add('O');
		bset.add('U');
		char[] bs = s.toCharArray();
		int left = 0;
		int right = bs.length - 1;
		while (left < right) {
			while (!bset.contains(bs[left]) && left < right) {
				left++;
			}
			while (!bset.contains(bs[right])&& left < right) {
				right--;
			}
			if (left < right) {
				char tmp = bs[left];
				bs[left] = bs[right];
				bs[right] = tmp;

				left++;
				right--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char b : bs) {
			sb.append(b);
		}
		return sb.toString();
	}

}
