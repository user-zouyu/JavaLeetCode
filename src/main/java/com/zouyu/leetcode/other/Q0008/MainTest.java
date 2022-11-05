package com.zouyu.leetcode.other.Q0008;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/1 20:44
 * @version 1.0.0
 */
public class MainTest {
    private final Solution solution = new Solution();

    @Test
    void test1() {
        int atoi = solution.myAtoi("1234");
        Assertions.assertEquals(atoi, 1234);
    }
    @Test
    void test2() {
        int atoi = solution.myAtoi("   -42");
        Assertions.assertEquals(atoi, -42);
    }

    @Test
    void test3() {
        int atoi = solution.myAtoi("4193 with words");
        Assertions.assertEquals(atoi, 4193);
    }


    @Test
    void testError1() {
        int atoi = solution.myAtoi("  -91283472332");
        Assertions.assertEquals(atoi, Integer.MIN_VALUE);
    }



}
