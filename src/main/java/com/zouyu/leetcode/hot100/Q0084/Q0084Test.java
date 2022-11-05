package com.zouyu.leetcode.hot100.Q0084;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/4 15:04
 * @version 1.0.0
 */
public class Q0084Test {

    private static final Solution solution = new SolutionStack();

    @Test
    void test1() {
        int[] heights = {2, 1, 5, 6, 2, 3};

        int area = solution.largestRectangleArea(heights);

        Assertions.assertEquals(area, 10);
    }

    @Test
    void test2() {
        int[] heights = {2, 3};

        int area = solution.largestRectangleArea(heights);

        Assertions.assertEquals(area, 4);
    }

    @Test
    void test3() {
        int[] heights = {3};

        int area = solution.largestRectangleArea(heights);

        Assertions.assertEquals(area, 3);
    }

    @Test
    void error1() {
        int[] heights = {0, 9};

        int area = solution.largestRectangleArea(heights);

        Assertions.assertEquals(area, 9);
    }

    @Test
    void error2() {
        int[] heights = {4, 2, 0, 3, 2, 4, 3, 4};

        int area = solution.largestRectangleArea(heights);

        Assertions.assertEquals(area, 10);
    }

}
