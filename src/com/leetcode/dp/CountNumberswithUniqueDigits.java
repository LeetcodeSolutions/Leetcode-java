package com.leetcode.dp;

public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
    	if(n == 0)
    		return 1;
     	int res = 10;
        int unigueDigits = 9;
        int availableNum = 9;
        while(n-- > 1 && availableNum > 0){
        	unigueDigits = unigueDigits * availableNum;
        	availableNum--;
        	res += unigueDigits;
        }
        return res;       
    }
}
