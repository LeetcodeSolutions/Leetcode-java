package com.leetcode.math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(2));

	}

	public boolean isHappy(int n) {
		int result = n;
		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			result = getOutput(result);
			System.out.println(result);
			if (result == 1)
				return true;
			if(set.contains(result))
				return false;
			else
				set.add(result);

		}
	}

	public int getOutput(int i) {
		int result = 0;
		while (i > 0) {
			result += (i % 10) * (i % 10);
			i = i / 10;
		}
		return result;
	}

}
