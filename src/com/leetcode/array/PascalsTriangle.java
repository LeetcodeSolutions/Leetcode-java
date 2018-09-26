package com.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> tmpRes = new ArrayList<Integer>();
			if (i == 1) {
				tmpRes.add(1);
			}  else {
				List<Integer> prev = result.get(i - 2);
				tmpRes.add(1);
				for (int j = 0; j < prev.size() - 1; j++) {
					tmpRes.add(prev.get(j) + prev.get(j + 1));
				}
				tmpRes.add(1);
			}
			result.add(tmpRes);
		}
		return result;
    }
}
