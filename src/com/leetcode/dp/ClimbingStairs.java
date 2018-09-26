package com.leetcode.dp;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int pp = 1;
        int p = 2;
        while(n > 2){
        	int oldP = p;
        	p = p + pp;
        	pp = oldP;
        	n--;
        }
        return p;  
    }

}
