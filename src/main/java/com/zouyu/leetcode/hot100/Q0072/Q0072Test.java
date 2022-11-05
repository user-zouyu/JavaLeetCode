package com.zouyu.leetcode.hot100.Q0072;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/5 12:16
 * @version 1.0.0
 */
public class Q0072Test {

    private static final Solution solution = new Solution();


    @Test
    void test1() {
        String word1 = "horse", word2 = "ros";
        int minDistance = solution.minDistance(word1, word2);
        Assertions.assertEquals(minDistance, 3);
    }

}
