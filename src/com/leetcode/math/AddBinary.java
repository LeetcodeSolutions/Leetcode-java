package com.leetcode.math;

public class AddBinary {
    public String addBinary(String a, String b) {
 		if (a == null && b == null)
			return null;
		if (a == null)
			return b;
		if (b == null)
			return a;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int lena = a.length() - 1;
		int lenb = b.length() - 1;
		
		while (lena >= 0 || lenb >= 0) {
			int sum = (lena >= 0 ? a.charAt(lena) - '0' : 0) + (lenb >= 0 ? b.charAt(lenb) - '0' : 0) + carry;
			sb.insert(0, sum % 2);
			carry = sum / 2;
			if (lena >= 0)
				lena--;
			if (lenb >= 0)
				lenb--;
		}
		
		if(carry > 0){
			sb.insert(0, carry);
		}
		return sb.toString();       
    }
}
