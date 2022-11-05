package com.zouyu.leetcode.hot100.Q0062;

/**
 * @author ZouYu 2022/11/1 9:53
 * @version 1.0.0
 */
public class Solution1 extends Solution {

    @Override
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

//        for (int[] ints : dp) {
//            System.out.println(Arrays.toString(ints));
//        }
        return dp[m - 1][n - 1];
    }
}
