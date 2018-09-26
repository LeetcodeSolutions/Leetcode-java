package com.leetcode.dp;

public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(2));
	}
	
    public static int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = G[1] = 1;
        for(int i = 2; i <= n; i++){
        	for(int j = 1; j <= i; j++){
        		G[i] += G[j - 1] * G[i - j];
        	}
        }
        return G[n];
    }
    
    public int numTrees2(int n) {
        int [] G = new int[n + 1];
        G[0] = G[1] = 1;
        
        for(int i=2; i<=n; ++i) {
        	for(int j=1; j <= i; ++j) {
        		G[i] += G[j-1] * G[i-j];
        	}
        }

        return G[n];
    }

}
