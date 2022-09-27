package com.zouyu.hot100.Q0005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/30 18:48
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
        String str = "";
        Assertions.assertEquals("", solution.longestPalindrome(str));
    }

    @Test
    void test_2() {
        String str = "a";
        Assertions.assertEquals("a", solution.longestPalindrome(str));
    }

    @Test
    void test_3() {
        String str = "aba";
        Assertions.assertEquals("aba", solution.longestPalindrome(str));
    }

    @Test
    void test_4() {
        String str = "abad";
        Assertions.assertEquals("aba", solution.longestPalindrome(str));
    }
    @Test
    void test_5() {
        String str = "abcad";
        Assertions.assertEquals("a", solution.longestPalindrome(str));
    }

    @Test
    void test_6() {
        String str = "daba";
        Assertions.assertEquals("aba", solution.longestPalindrome(str));
    }

    @Test
    void error1() {
        String str = "sssss";
        Assertions.assertEquals("sssss", solution.longestPalindrome(str));
    }
}
