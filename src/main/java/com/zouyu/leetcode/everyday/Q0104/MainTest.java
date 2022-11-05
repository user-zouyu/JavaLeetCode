package com.zouyu.leetcode.everyday.Q0104;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/9/27 12:25
 * @version 1.0.0
 */

public class MainTest {

    private static Solution solution;

    @BeforeAll
    public static void init() {
        solution = new Solution();
    }

    @Test
    void test1() {
        String str1 = "abc";
        String str2 = "bca";
        boolean b = solution.CheckPermutation(str1, str2);

        Assertions.assertTrue(b);
    }

    @Test
    void test2() {
        String str1 = "abc";
        String str2 = "bad";

        boolean b = solution.CheckPermutation(str1, str2);

        Assertions.assertFalse(b);

    }
}
