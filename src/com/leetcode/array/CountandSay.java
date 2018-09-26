package com.leetcode.array;

public class CountandSay {
    public static String countAndSay(int n) {
    	String newString = "1";
    	while(n > 1){
    		StringBuilder sb = new StringBuilder();
    		int count = 1;
    		for(int i = 1; i < newString.length(); i++){
    			if(newString.charAt(i) == newString.charAt(i - 1)){
    				count++;
    			}else{
    				sb.append(count);
    				sb.append(newString.charAt(i - 1));
    				count = 1;
    			}
    		}
    		sb.append(count);
    		sb.append(newString.charAt(newString.length() - 1));
    		newString = sb.toString();
    		n--;
    	}
    	return newString;
    }
    public static void main(String[] args) {
		for(int i = 1; i < 10; i++){
			System.out.println(countAndSay(i));
		}
	}
}
