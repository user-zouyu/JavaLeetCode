package com.zouyu.leetcode.hot100.Q0010;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/23 19:28
 * @version 1.0.0
 */
public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
         solution = new Solution();
    }

    @Test
    void test() {
        boolean match = solution.isMatch("aaabbab", "a*b*a.");

        System.out.println(match);
        Assertions.assertTrue(match);
    }

    @Test
    void error1() {
        boolean match = solution.isMatch("aa", "a");
        System.out.println(match);
        Assertions.assertFalse(match);
    }

    @Test
    void error2() {
        boolean match = solution.isMatch("aa", ".*");
        System.out.println(match);
        Assertions.assertTrue(match);
    }

    @Test
    void error3() {
        boolean match = solution.isMatch("aab", "c*a*b*");
        System.out.println(match);
        Assertions.assertTrue(match);
    }

}
