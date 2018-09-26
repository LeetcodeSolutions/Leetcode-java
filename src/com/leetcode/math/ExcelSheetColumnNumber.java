package com.leetcode.math;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0)
     		return -1;
        Map<Character,Integer> map = new HashMap<Character,Integer>(); 
        map.put('A', 1);
        for(int i = 0; i < 26; i++){
     	   map.put((char)('A' + i), i + 1);
        }
        
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i--){
     	   result += map.get(s.charAt(i)) * Math.pow(26,s.length() - 1 - i);
        }
        return result;
     }

}
