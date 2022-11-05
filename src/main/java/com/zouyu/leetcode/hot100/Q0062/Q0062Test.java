package com.zouyu.leetcode.hot100.Q0062;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ZouYu 2022/11/1 9:41
 * @version 1.0.0
 */
public class Q0062Test {
    private static final Solution solution = new Solution1();


    @Test
    void test1() {

        int uniquePaths = solution.uniquePaths(3, 2);

        System.out.println(uniquePaths);

        Assertions.assertEquals(uniquePaths, 3);

    }

    @Test
    void test2() {

        int uniquePaths = solution.uniquePaths(10, 10);

        System.out.println(uniquePaths);

        Assertions.assertEquals(uniquePaths, 48620);

    }

}
