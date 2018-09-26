package com.leetcode.hashtable;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
		if(s == null || t == null)
			return false;
		if(s.length() != t.length()){
			return false;
		}
		int[] curt = new int[256];
		for(int i = 0; i < s.length(); i++){
			curt[s.charAt(i)]++;
		}
		
		for(int j = 0; j < t.length(); j++){
			if(--curt[t.charAt(j)] < 0)
				return false;
		}
		return true;
    }
}
