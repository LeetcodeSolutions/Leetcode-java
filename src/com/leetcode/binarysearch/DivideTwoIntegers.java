package com.leetcode.binarysearch;

public class DivideTwoIntegers {

	public static void main(String[] args) {

		DivideTwoIntegers dti = new DivideTwoIntegers();
		System.out.println(dti.divide(0, 0));;
	}

	public int divide(int dividend, int divisor) {
		int sign = 1;
		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
			sign = -1;
		
		if (divisor == 0)
			return Integer.MAX_VALUE;
		if (dividend == 0)
			return 0;
		 
		int count = devided(Math.abs(dividend), Math.abs(divisor));
		if (sign == 1)
			return count;
		else
			return -count;
	}

	public int devided(int dividend, int divisor) {
		if(dividend < divisor)
			return 0;
		int sum = divisor;
		int count = 1;
		while ((sum + sum) <= dividend) {
			sum = sum + sum;
			count += count;
		}
		return count + devided(dividend - sum, divisor);
	}
	
	
	public int divide2(int dividend, int divisor) {
	    //Reduce the problem to positive long integer to make it easier.
	    //Use long to avoid integer overflow cases.
	    int sign = 1;
	    if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0))
	        sign = -1;
	    long ldividend = Math.abs((long) dividend);
	    long ldivisor = Math.abs((long) divisor);

	    //Take care the edge cases.
	    if (ldivisor == 0) return Integer.MAX_VALUE;
	    if ((ldividend == 0) || (ldividend < ldivisor)) return 0;

	    long lans = ldivide(ldividend, ldivisor);

	    int ans;
	    if (lans > Integer.MAX_VALUE){ //Handle overflow.
	        ans = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
	    } else {
	        ans = (int) (sign * lans);
	    }
	    return ans;
	}

	private long ldivide(long ldividend, long ldivisor) {
	    // Recursion exit condition
	    if (ldividend < ldivisor) return 0;

	    //  Find the largest multiple so that (divisor * multiple <= dividend), 
	    //  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
	    //  Think this as a binary search.
	    long sum = ldivisor;
	    long multiple = 1;
	    while ((sum+sum) <= ldividend) {
	        sum += sum;
	        multiple += multiple;
	    }
	    //Look for additional value for the multiple from the reminder (dividend - sum) recursively.
	    return multiple + ldivide(ldividend - sum, ldivisor);
	}

}
