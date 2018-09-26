package com.leetcode.sting;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
		if (s == null || s.length() <= 1)
			return s;
		StringBuilder[] sbs = new StringBuilder[numRows];
		for(int k = 0; k < numRows; k++){
			sbs[k] = new StringBuilder();
		}
		int len = s.length();

		int i = 0;
		while (i < len) {
			for (int m = 0; m < numRows && i < len; m++) {
				sbs[m].append(s.charAt(i++));
			}

			for (int n = numRows - 2; n > 0 && i < len; n--) {
				sbs[n].append(s.charAt(i++));
			}
		}
		
		for(int j = 1; j < sbs.length; j++){
			sbs[0].append(sbs[j]);
		}
		return sbs[0].toString();
    }
}
