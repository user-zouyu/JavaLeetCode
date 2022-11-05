package com.zouyu.leetcode.hot100.Q0064;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author ZouYu 2022/11/1 10:01
 * @version 1.0.0
 */
public class Q0064Test {

    private static final Solution solution = new Solution();


    @Test
    void test1() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int pathSum = solution.minPathSum(grid);
        for (int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(pathSum);

        Assertions.assertEquals(pathSum, 7);
    }

}
