package com.leetcode.sting;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public String reverseString(String s) {
        if(s == null || s.length() <= 1)
        	return s;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();   
    }
}
