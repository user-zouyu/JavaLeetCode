package com.zouyu.leetcode.hot100.Q0062;

/**
 * @author ZouYu 2022/11/1 9:33
 * @version 1.0.0
 */
class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}
