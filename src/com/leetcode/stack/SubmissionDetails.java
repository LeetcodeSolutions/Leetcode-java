package com.leetcode.stack;

public class SubmissionDetails {
    public boolean isValidSerialization(String preorder) {
        String s = preorder.replaceAll("\\d+,#,#", "#");
        return s.equals("#") || !s.equals(preorder) && isValidSerialization(s); 
    }
}
