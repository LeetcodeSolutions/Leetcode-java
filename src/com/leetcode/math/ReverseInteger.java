package com.leetcode.math;

public class ReverseInteger {
    public int reverse(int x) {
        int sign = x >=0 ? 1 : -1;
        
        int num = Math.abs(x);
        
        long result = 0;
        while(num > 0){
        	result = result * 10 + num % 10;
        	num = num / 10;
        }
        if(result > Integer.MAX_VALUE)
        	return 0;
        return (int)(result * sign);      
    }
}
