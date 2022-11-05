package com.zouyu.leetcode.hot100.Q0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ZouYu 2022/11/1 8:50
 * @version 1.0.0
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2)-> {
            if (i1[0] < i2[0]) {
                return -1;
            }

            if (i1[0] > i2[0]) {
                return 1;
            }

            return -Integer.compare(i2[1], i1[1]);
        });

        List<int[]> res = new ArrayList<>();
        int start = -1;
        int end = start;
        for (int[] interval : intervals) {
            if (start == -1) {
                start = interval[0];
                end = interval[1];
            } else if (start == interval[0]) {
                end = interval[1];
            } else if (interval[0] <= end) {
                end = Math.max(interval[1], end);
            } else {
                res.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }

        }

        res.add(new int[]{start, end});
        return res.toArray(new int[0][]);
    }
}
