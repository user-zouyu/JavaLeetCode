package com.zouyu.hot100.Q0064;

/**
 * @author ZouYu 2022/11/1 10:01
 * @version 1.0.0
 */
class Solution {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        for (int i = 1; i < m; i++) {
            grid[i][0] = grid[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < n; i++) {
            grid[0][i] = grid[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }

        }

        return grid[m - 1][n - 1];
    }
}