package com.zouyu.leetcode.hot100.Q0070;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/5 12:10
 * @version 1.0.0
 */
public class Q0070Test {

    private static final Solution solution = new Solution();

    @Test
    void test1() {
        int climbStairs = solution.climbStairs(2);
        Assertions.assertEquals(climbStairs, 2);
    }

    @Test
    void test2() {
        int climbStairs = solution.climbStairs(3);
        Assertions.assertEquals(climbStairs, 3);
    }

    @Test
    void test3() {
        int climbStairs = solution.climbStairs(4);
        Assertions.assertEquals(climbStairs, 5);
    }

}
