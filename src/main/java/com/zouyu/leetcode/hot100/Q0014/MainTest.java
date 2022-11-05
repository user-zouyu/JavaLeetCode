package com.zouyu.leetcode.hot100.Q0014;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/27 13:48
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test_1() {
        int[] height = {1, 1};

        Assertions.assertEquals(1, solution.maxArea(height));
    }

    @Test
    void test_2() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        Assertions.assertEquals(49, solution.maxArea(height));
    }

}
