package com.zouyu.leetcode.hot100.Q0048;

/**
 * @author ZouYu 2022/10/31 18:36
 * @version 1.0.0
 */
class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        int width = length - 1;
        int row = (length + 1) / 2;
        int col = length / 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j]= matrix[width - j][i];
                matrix[width - j][i] = matrix[width - i][width - j];
                matrix[width - i][width - j] = matrix[j][width - i];
                matrix[j][width - i] = temp;
            }
        }
    }
}