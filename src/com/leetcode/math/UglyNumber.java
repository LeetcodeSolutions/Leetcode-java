package com.leetcode.math;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(isUgly(2));
		System.out.println(isUgly(1));
	}

	public  static boolean isUgly(int num) {
		if(num < 1)
			return false;
		while (num % 2 == 0) {
			num = num / 2;
		}

		while (num % 3 == 0) {
			num = num / 3;
		}

		while (num % 5 == 0) {
			num = num / 5;
		}
		
		return num == 1;
	}

}
