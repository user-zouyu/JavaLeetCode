package com.zouyu.hot100.Q0003;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/8/20 23:09
 * @version 1.0.0
 */
public class Q0003Test {

    private static Solution solution;

    @BeforeAll
    public static void init() {
         solution = new Solution();
    }

    @Test
    void test1() {
        int max = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(max);
    }

    @Test
    void test2() {
        int max = solution.lengthOfLongestSubstring("bbbb");
        System.out.println(max);
    }

    @Test
    void error1() {
        int max = solution.lengthOfLongestSubstring(" ");
        System.out.println(max);
    }



}
