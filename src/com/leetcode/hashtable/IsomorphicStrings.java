package com.leetcode.hashtable;

public class IsomorphicStrings {

	public static void main(String[] args) {
		String s1 = "egg";
		String s2 = "foo";
		String s3 = "paper";
		String t1 = "add";
		String t2 = "bar";
		String t3 = "title";
		System.out.println(isIsomorphic(s1, t1));
		System.out.println(isIsomorphic(s2, t2));
		System.out.println(isIsomorphic(s3, t3));
	}
	
    public static boolean isIsomorphic(String s, String t) {
        if(s == null || t == null)
        	return false;
        int[] a1 = new int[256];
        int[] a2 = new int[256];
        for(int i = 0; i < s.length(); i++){
        	if(a1[s.charAt(i)] != a2[t.charAt(i)])
        		return false;
        	a1[s.charAt(i)] = i + 1;
        	a2[t.charAt(i)] = i + 1;
        }
        return true;
    }

}
