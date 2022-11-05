package com.zouyu.leetcode.hot100.Q0070;

/**
 * @author ZouYu 2022/11/5 12:08
 * @version 1.0.0
 */
class Solution {
    public int climbStairs(int n) {
        int[] df = new int[3];
        df[0] = 1;
        df[1] = 2;

        for (int i = 2; i < n; i++) {
            df[i % 3] = df[(i - 1) % 3] + df[(i - 2) % 3];
        }

        return df[(n - 1) % 3];
    }
}
