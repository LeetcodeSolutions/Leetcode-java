package com.leetcode.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairswithSmallestSums {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
		List<int[]> res = new ArrayList<int[]>();
		if(nums1.length == 0 || nums2.length == 0)
			return res;
          PriorityQueue<int[]> q = new PriorityQueue<int[]>(nums1.length + nums2.length, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return (o1[0] + o1[1]) - (o2[0] + o2[1]);
			}
		});
        
        for(int i = 0; i < nums1.length; i++){
        	for(int j = 0; j < nums2.length; j++){
        		int[] a = new int[2];
        		a[0] = nums1[i];
        		a[1] = nums2[j];
        		q.add(a);
        	}
        }
        
        
        while(k > 0 && !q.isEmpty()){
        	res.add(q.poll());
        	k--;
        }
        return res;      
    }
}
