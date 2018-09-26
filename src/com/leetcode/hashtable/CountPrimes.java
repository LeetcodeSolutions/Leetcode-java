package com.leetcode.hashtable;

public class CountPrimes {
	public  boolean isPrime(int n){
		if(n < 2)
			return false;
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
    public int countPrimes(int n) {
    	boolean[] counts = new boolean[n];
    	int count = 0;
    	for(int i = 2; i < n; i++){
    		if(counts[i])
    			continue;
    		count++;
    		for(int j = i; j < n; j+= i){
    			counts[j] = true;
    		}
    	}
    	return count;
    }
}
